import java.util.*;

public class Main {
    public static int N, K;
    public static int n, m, dirNum;
    public static void initialize() {
        int a = K % N == 0 ? N : K % N;

        if(K <= N) {
            dirNum = 0;
            n = 0;
            m = a -1;
        } else if (K <= 2 * N) {
            dirNum = 1;
            n = a -1;
            m = N - 1;
        } else if (K <= 3 * N) {
            dirNum = 2;
            n = N - 1;
            m = N - 1 - (a -1);
        } else {
            dirNum = 3;
            n = N - 1 - (a -1);
            m = 0;
        }
    }

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        char[][] grid = new char[N][N];
        for(int i = 0; i<N; i++) {
            String input = sc.next();
            for(int j = 0; j<N; j++) {
                grid[i][j] = input.charAt(j);
            }
        }
        K = sc.nextInt();

        // 초기화
        initialize();



        int[] dn = new int[] {1, 0, -1, 0};
        int[] dm = new int[] {0, -1, 0, 1};

        int count = 0;

        while(inRange(n,m)) {
            if(grid[n][m] == '/') {
                dirNum = dirNum^1;
            } else {
                dirNum = 3 - dirNum; 
            }
            n += dn[dirNum];
            m += dm[dirNum];              
            count++; 
        }
        
        System.out.print(count);
        

    }

    public static boolean inRange(int n, int m) {
        return n>=0 && n<N && m >=0 && m<N;
    }
}