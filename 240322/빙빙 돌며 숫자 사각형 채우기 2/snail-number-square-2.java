import java.util.*;

public class Main {
    public static int N;
    public static int M;
    
    public static boolean inRange(int n, int m) {
        return n >=0 && n <N && m >=0 && m<M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int[] dn = new int[] {1, 0, -1, 0};
        int[] dm = new int[] {0, 1, 0, -1};

        int[][] matrix = new int[N][M];

        int dirNum = 0;
        int n = 0, m = 0;
        for(int i = 1; i <= N*M; i++) {
            matrix[n][m] = i;

            int psudoNextN = n + dn[dirNum];
            int psudoNextM = m + dm[dirNum];
            
            if(!inRange(psudoNextN, psudoNextM) || matrix[psudoNextN][psudoNextM] != 0) {
                dirNum = (dirNum+1)%4;
            }
            n = n + dn[dirNum];
            m = m + dm[dirNum];
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}