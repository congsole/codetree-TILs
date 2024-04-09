import java.util.*;

public class Main {
    public static int n, m;
    public static int[] dr = new int[]{0, 1, 0, -1};
    public static int[] dc = new int[]{1, 0, -1, 0};
    public static int[][] matrix;
    public static int[][] temp;

    public static boolean inRange(int r, int c) {
        return r>=0 && r<n && c>=0 && c<n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        matrix = new int[n][n];
        temp = new int[n][n];
        for(int i=0; i<n; i++) 
            for(int j=0; j<n; j++)
                matrix[i][j] = sc.nextInt();

        int turn = 1;
        while(turn <= m) {
            int col = sc.nextInt() -1;
            
            for(int i=0; i<n; i++) 
                for(int j=0; j<n; j++)
                    temp[i][j] = 0;

for(int i=0; i<n; i++) {
                if(matrix[i][col] != 0) {
                    int dit = matrix[i][col];
                    for(int dir=0; dir<4; dir++) {
                        for(int j=0; j<dit; j++) {
                            int nextR = i + j*dr[dir];
                            int nextC = col + j*dc[dir];
                            if(inRange(nextR, nextC)) {
                                matrix[nextR][nextC] = 0;
                            }
                        }
                    }
                    break;
                }
            }

            for(int j=0; j<n; j++) {
                int rowNum = n-1;
                for(int i=n-1; i>=0; i--) {
                    if(matrix[i][j] == 0) continue;
                    temp[rowNum--][j] = matrix[i][j]; 
                }
            }
            for(int i=0; i<n; i++) 
                for(int j=0; j<n; j++)
                    matrix[i][j] = temp[i][j];
            turn++;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}