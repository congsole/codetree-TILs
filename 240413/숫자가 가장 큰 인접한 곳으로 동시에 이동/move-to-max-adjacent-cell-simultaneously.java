import java.util.*;

class NextPosition implements Comparable<NextPosition> {
    int dirNum;
    int value;
    public NextPosition(int d, int v) {
        this.dirNum = d;
        this.value = v;
    }
    @Override
    public int compareTo(NextPosition np) {
        if(np.value == this.value) {
            return this.dirNum - np.dirNum;
        }
        return np.value - this.value;
    }
}

public class Main {
    public static int N, M, T;
    public static int[][] matrix, count, nextCount;
    public static int[] dr = new int[]{-1, 1, 0, 0};
    public static int[] dc = new int[]{0, 0, -1, 1};
    public static boolean inRange(int r, int c) {
        return r>=0 && r<N && c>=0 && c<N;
    }
    public static void initialize(int[][] array) {
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                array[i][j] = 0;
            }
        }
    }
    public static void copy() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(nextCount[i][j] > 1) count[i][j] = 0;
                count[i][j] = nextCount[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 격자의 크기
        M = sc.nextInt(); // 구슬의 갯수
        T = sc.nextInt(); // 이동 횟수
        matrix = new int[N][N];
        count = new int[N][N];
        nextCount = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<M; i++) {
            count[sc.nextInt()-1][sc.nextInt()-1] = 1;
        }

        int t = 1;
        while(t <= T) {
            initialize(nextCount);
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(count[i][j] == 1) {
                        List<NextPosition> list = new ArrayList<>();
                        for(int dirNum=0; dirNum<4; dirNum++) {
                            int nextR = i+dr[dirNum];
                            int nextC = j+dc[dirNum];
                            if(inRange(nextR, nextC)) {
                                list.add(new NextPosition(dirNum, matrix[nextR][nextC]));
                            }
                        }
                        Collections.sort(list);
                        int dirNum = list.get(0).dirNum;
                        int nextR = i + dr[dirNum];
                        int nextC = j + dc[dirNum];
                        nextCount[nextR][nextC]++;
                    }
                }
            }

            initialize(count);
            copy();

            t++;
        }

        int ans = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                ans += count[i][j];
            }
        }
        System.out.print(ans);
    }
}