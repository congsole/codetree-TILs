import java.util.*;



public class Main {
    public static int N, M;
    public static int[][] matrix;
    public static int[] dr = new int[]{0, 1, 0, -1};
    public static int[] dc = new int[]{1, 0, -1, 0};
    
    public static boolean inRange(int n, int m) {
        return n>=0 && n<N && m>=0 && m<N;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        matrix = new int[N][N];

        for(int i=0; i<M; i++) {
            int r = sc.nextInt()-1;
            int c = sc.nextInt()-1;
            matrix[r][c] = 1;
            int cnt = 0;
            for(int dir=0; dir<4; dir++) {
                int nextR = r + dr[dir];
                int nextC = c + dc[dir];
                if(inRange(nextR, nextC) && matrix[nextR][nextC] == 1) {
                    cnt++;
                }
            }
            System.out.println(cnt == 3 ? 1 : 0);
        }
    
    }
}