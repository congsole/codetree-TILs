import java.util.*;

public class Main {
    public static int N, M;
    
    public static boolean inRange(int n, int m) {
        return n>=0 && n<N && m>=0 && m<M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        char[][] matrix = new char[N][M];
        int[] dn = new int[] {0, 1, 0, -1};
        int[] dm = new int[] {1, 0, -1, 0};
        int dirNum = 0;
        int n = 0, m = 0;
        char cha = 'A';
        int total = N*M;
        while(total-- > 0) {
            matrix[n][m] = cha;
            
            if(cha == 'Z') {
                cha = 'A';
            } else {
                cha++;
            }

            int nextN = n + dn[dirNum];
            int nextM = m + dm[dirNum];
            if(!inRange(nextN, nextM) || matrix[nextN][nextM] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            n = n + dn[dirNum];
            m = m + dm[dirNum];
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        

    }
}