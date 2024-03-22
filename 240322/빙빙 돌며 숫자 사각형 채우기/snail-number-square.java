import java.util.*;

public class Main {
    
    public static int N;
    public static int M;

    public static boolean inRange(int n, int m) {
        return n>=0 && n<N && m>=0 && m<M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
   
        int[][] matrix = new int[N][M];

        int[] dn = new int[] {0, 1, 0, -1}; //행
        int[] dm = new int[] {1, 0, -1, 0}; //열
    
        int dirNum = 0;
        int n = 0;
        int m = 0;
        
        for(int i = 1; i <= N*M; i++) {
            matrix[n][m] = i;

            if(!inRange(n + dn[dirNum], m + dm[dirNum]) || matrix[n + dn[dirNum]][m + dm[dirNum]] != 0) {
                dirNum = (dirNum + 1) % 4;
            }
            n = n + dn[dirNum];
            m = m + dm[dirNum];    

        }

        for(int i = 0; i < N; i++ ) {
            for(int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}