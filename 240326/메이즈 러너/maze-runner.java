import java.util.*;

class Runner {
    int n, m;
    boolean exit = false;
    int distance = 0;
    public Runner(int n, int m) {
        this.n = n;
        this.m = m;
    }
}

class Exit {
    int n, m;
    public Exit(int n, int m) {
        this.n = n;
        this.m = m;
    }
}

public class Main {
    public static int[] dn = new int[]{-1, 1, 0, 0};
    public static int[] dm = new int[]{0, 0, -1, 1};
    public static int N,M,K;
    public static boolean inRange(int n, int m) {
        return n>=1 && m>=1 && n<=N && m<=N;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        int[][] matrix = new int[N+1][N+1];
        int[][] nextMatrix = new int[N+1][N+1];

        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N;j++) {
                int value = sc.nextInt();
                matrix[i][j] = value;
                nextMatrix[i][j] = value;
            }
        }

        Runner[] runners = new Runner[M];
        for(int i=0;i<M;i++) {
            runners[i] = new Runner(sc.nextInt(), sc.nextInt());
        }

        Exit exit = new Exit(sc.nextInt(), sc.nextInt());

        int t = 1;
        while(t <= K) {
            // System.out.println(t);
            // 1초마다 움직인 후 , 움직인 거리 더한후, 회전
        
            for(int i=0; i<M; i++) {
                if(runners[i].exit) continue;
                int shortest = Math.abs(exit.n - runners[i].n) + Math.abs(exit.m - runners[i].m);
                for(int dir=0; dir<4; dir++) {
                    int nextN = runners[i].n + dn[dir];
                    int nextM = runners[i].m + dm[dir];
                    int distance = Math.abs(nextN-exit.n) + Math.abs(nextM-exit.m);
                    if(inRange(nextN, nextM) && matrix[nextN][nextM] < 1 && distance < shortest) {
                        runners[i].n = nextN;
                        runners[i].m = nextM;
                        runners[i].distance++;
                        if(runners[i].n == exit.n && runners[i].m == exit.m) runners[i].exit = true;
                        break;
                    }
                }
            }
            // System.out.printf("이동후 : ");
            // for(int k=0; k<M; k++) {
            //     System.out.printf("(%d, %d)", runners[k].n, runners[k].m);
            // }
            // System.out.println();

            // 모든 러너가 한 칸 씩 움직인 후에 탈출했는지 체크
            int count = 0;
            boolean ifAllRunnersExited = true;
            for(int i=0; i<M; i++) {
                if(!runners[i].exit) {
                    ifAllRunnersExited = false;
                    break;
                }
                count += runners[i].distance;
            }
            if(ifAllRunnersExited) {
                // System.out.println("시간 초 되기 전에 모두 탈출!@");
                System.out.println(count);
                System.out.println(exit.n + " " + exit.m);
                return;
            }

            // 가장 작은 정사각형 알아내기
            int shortedLength = 0;
            int rotateN = 0;
            int rotateM = 0;
        
            loop1:
            for(int length=2; length<=10; length++) {
                for(int i=1; i<=N-(length-1); i++) {
                    for(int j=1; j<=N-(length-1); j++) {
                        if(exit.n>=i && exit.n<=i+length-1 && exit.m>=j && exit.m<=j+length-1) {
                            for(int k=0; k<M; k++) {
                                int kn = runners[k].n, km = runners[k].m;
                                if(!runners[k].exit && kn>=i && kn<=i+length-1 && km>=j && km<=j+length-1) {
                                    shortedLength = length;
                                    rotateN = i;
                                    rotateM = j;
                                    // System.out.println(i + " "+ j + " " + length);
                                    break loop1;
                                }
                            }
                        }
                    }
                }
            }

            // 정사각형 회전시키기
            for(int i=rotateN; i<rotateN + shortedLength; i++) {
                for(int j=rotateM; j<rotateM + shortedLength; j++) {
                    
                    int on = i-rotateN, om = j-rotateM;
                    int rn = om, rm = shortedLength-1-on;
                    nextMatrix[rn+rotateN][rm+rotateM] = --matrix[i][j];
                }
            }
            for(int i=1; i<=N; i++) {
                for(int j=1; j<=N; j++) {
                    matrix[i][j] = nextMatrix[i][j];
                }
            }

            // runner 회전시키기
            for(int i=0; i<M; i++) {
                int runnerN = runners[i].n, runnerM = runners[i].m;
                if(!runners[i].exit && runnerN >= rotateN && runnerM >=rotateM && runnerN < rotateN + shortedLength && runnerM < rotateM+shortedLength) {
                    int on = runnerN - rotateN, om = runnerM - rotateM;
                    int rn = om, rm = shortedLength-1-on;
                    runners[i].n = rn + rotateN;
                    runners[i].m = rm + rotateM;
                }
            }
            // System.out.printf("회전후 : ");
            // for(int k=0; k<M; k++) {
            //     System.out.printf("(%d, %d)", runners[k].n, runners[k].m);
            // }
            // System.out.println();
            // 출구 회전시키기

            int on = exit.n - rotateN, om = exit.m - rotateM;
            int rn = om, rm = shortedLength -1 -on;
            exit.n = rn + rotateN;
            exit.m = rm + rotateM;
            
            t++;
            // System.out.println("회전후 출구 : (" + exit.n + ", " + exit.m + ")");
        }
            
        int count = 0;
        for(int i=0; i<M; i++) {
            count += runners[i].distance;
        }
        System.out.println(count);
        System.out.println(exit.n + " " + exit.m);


    }
}