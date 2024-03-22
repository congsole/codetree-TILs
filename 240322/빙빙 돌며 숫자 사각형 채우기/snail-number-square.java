import java.util.*;

public class Main {
    
    public static int n;
    public static int m;

    public static boolean inRange(int x, int y) {
        return x>=0 && x<n && y>=0 && y<m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
   
        int[][] matrix = new int[m][n];

        int[] dy = new int[] {0, 1, 0, -1}; //행
        int[] dx = new int[] {1, 0, -1, 0}; //열
    
        int dirNum = 0;
        int x = 0;
        int y = 0;
        
        for(int i = 1; i <= m*n; i++) {
            matrix[y][x] = i;

            if(!inRange(x + dx[dirNum], y + dy[dirNum]) || matrix[y + dy[dirNum]][x + dx[dirNum]] != 0) {
                dirNum = (dirNum + 1) % 4;
            }
            x = x + dx[dirNum];
            y = y + dy[dirNum];    
        }

        for(int i = 0; i < n; i++ ) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}