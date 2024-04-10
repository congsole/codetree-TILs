import java.util.*;

class Bomb {
    int r, c;
    public Bomb(int r, int c) {
        this.r = r;
        this.c = c;
    }
}


public class Main {
    public static int N, M;
    public static int initialR, initialC;
    public static List<Bomb> list = new ArrayList<>();
    public static int[] dr = new int[]{1, 0, -1, 0};
    public static int[] dc = new int[]{0, 1, 0, -1};
    public static int[][] matrix;
    public static boolean inRange(int r, int c) {
        return r>=0 && r<N && c>=0 && c<N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        initialR = sc.nextInt() - 1;
        initialC = sc.nextInt() - 1;
        matrix = new int[N][N];
        matrix[initialR][initialC] = 1;
        list.add(new Bomb(initialR, initialC));

        int t = 1;
        while(t <= M) {
            int distance = (int)Math.pow(2, t-1);
            List<Bomb> newList = new ArrayList<>();
            for(Bomb bomb : list) {
                for(int dir=0; dir<4; dir++) {
                    int nextR = bomb.r + distance*dr[dir];
                    int nextC = bomb.c + distance*dc[dir];
                    if(inRange(nextR, nextC) && matrix[nextR][nextC] == 0) {
                        newList.add(new Bomb(nextR, nextC));
                        matrix[nextR][nextC] = 1;
                    }
                }
            }
            list.addAll(newList);

            t++;
        }

        System.out.print(list.size());
    }

}