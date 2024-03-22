import java.util.*;

public class Main {
    public static int n;   
    
    public static boolean inRange(int x, int y) {
        return x>=0 && x<n && y>=0 && y<n;
    }
    
    public static void main(String[] args) {
        int[] dy = new int[] {1, 0, -1, 0}; //행
        int[] dx = new int[] {0, 1, 0, -1}; //열
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int[][] plane = new int[n][n];
        int[][] checked = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                plane[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int dirNum=0; dirNum<4; dirNum++) {
                    int y = i + dy[dirNum];
                    int x = j + dx[dirNum];
                    if(inRange(x,y) && plane[x][y] == 1) {
                        checked[i][j]++;
                    }
                }
                if(checked[i][j]>2) {
                    cnt++;
                }        
            }
            // System.out.println();
        }

        System.out.print(cnt);
        


    }
}