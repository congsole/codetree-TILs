import java.util.*;

public class Main {
    public static int N, T, MAX;
    public static int[][] grid;
    public static int[] dr = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dc = new int[]{1, 1, 0, -1, -1, -1, 0, 1};
    public static boolean inRange(int r, int c) {
        return r>=0 && r<N && c>=0 && c<N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        MAX = N * N;
        grid = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                grid[i][j] = sc.nextInt();

        int turn = 1;
        while(turn <= T) {
            for(int n=1; n<=MAX; n++) {
                loop1: for(int i=0; i<N; i++) {
                    for(int j=0; j<N; j++) {
                        if(n == grid[i][j]) {
                            int nextMax = 0;
                            int nextRR = 0, nextCC = 0;
                            for(int dir=0; dir<8; dir++) {
                                int nextR = i + dr[dir];
                                int nextC = j + dc[dir];
                                if(inRange(nextR, nextC)) {
                                    nextMax = Math.max(grid[nextR][nextC], nextMax);
                                    if(nextMax == grid[nextR][nextC]) {
                                        nextRR = nextR;
                                        nextCC = nextC;
                                    }
                                }
                            }
                            grid[nextRR][nextCC] = n;
                            grid[i][j] = nextMax;
                            break loop1;
                        }
                    }
                }
            }


            turn++;
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}