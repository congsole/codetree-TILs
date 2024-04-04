import java.util.*;

public class Main {
    public static int N;
    public static int[][] matrix;
    public static int[][] temp;
    public static int[] dn = new int[]{0, 0, 1, 0, -1};
    public static int[] dm = new int[]{0, 1, 0, -1, 0};
    public static boolean inRange(int x, int y) {
        return x>=0 && x<N && y>=0 && y<N;
    }
    public static void bomb(int n, int m, int d) {
        int dirNum = 0;
        for(int dir=0; dir<5; dir++) {
            int distance = 1;
            int nextN = n;
            int nextM = m;
            while(distance <= d) {
                nextN += dn[dir];
                nextM += dm[dir];
                matrix[nextN][nextM] = 0;
                distance++;
            }
        }
    }

    public static void gravity() {
        for(int j=0; j<N; j++) {
            int countN = N - 1;
            for(int i=N-1; i>=0; i--) {
                if(matrix[i][j] > 0) {
                    temp[countN][j] = matrix[i][j];
                    countN--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        matrix = new int[N][N];
        temp = new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                matrix[i][j] = sc.nextInt();
        
        int n = sc.nextInt() - 1;
        int m = sc.nextInt() - 1;
        int d = matrix[n][m] - 1;
        
        bomb(n, m, d);
        gravity();
        

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }






    }
}