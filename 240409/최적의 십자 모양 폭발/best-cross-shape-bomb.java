import java.util.*;

public class Main {
    public static int N;
    public static int[][] matrix, replica;
    public static int[][] temp;
    public static int[] dr = new int[]{0, 1, 0, -1};
    public static int[] dc = new int[]{1, 0, -1, 0};

    public static void copy() {
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                replica[i][j] = matrix[i][j];
    }

    public static boolean inRange(int r, int c) {
        return r>=0 && r<N && c>=0 && c<N;
    }

    public static void pang(int dit, int i, int j) {
        for(int dir=0; dir<4; dir++) {
            for(int d=0; d<dit; d++) {
                int nextR = i + d*dr[dir];
                int nextC = j + d*dc[dir];
                if(inRange(nextR, nextC)) {
                    replica[nextR][nextC] = 0;
                }
            }
        }
    }
    public static void drop() {
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                temp[i][j] = 0;

        for(int j=0; j<N; j++) {
            int rowNum = N - 1;
            for(int i=N-1; i>=0; i--) {
                if(replica[i][j] == 0) continue;
                temp[rowNum--][j] = replica[i][j];
            }
        }
    }

    public static int findPair() {
        int pair = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(temp[i][j] == 0) continue;
                if(inRange(i+1, j) && temp[i][j] == temp[i+1][j]) pair++;
                if(inRange(i, j+1) && temp[i][j] == temp[i][j+1]) pair++;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        matrix = new int[N][N];
        replica = new int[N][N];
        temp = new int[N][N];

        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                matrix[i][j] = sc.nextInt();
        
        int pairMax = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                copy();
                int dit = matrix[i][j];
                pang(dit, i, j);
                drop();

                /**/
                // for(int k=0; k<N; k++) {
                //     for(int l=0; l<N; l++) {
                //         System.out.print(temp[k][l] + " ");
                //     }
                //     System.out.println();
                // }
                // System.out.println("---------------");

                int pair = findPair();
                pairMax = Math.max(pair, pairMax);
            }
        }

        System.out.print(pairMax);
    }
}