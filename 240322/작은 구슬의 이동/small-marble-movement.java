import java.util.*;

public class Main {
    public static int n;

    public static boolean inRange(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= n;
    }

    public static int getDirNum(char dirCmd) {
        int dirNum = 0;
        if(dirCmd == 'R') dirNum = 1;
        if(dirCmd == 'U') dirNum = 0;
        if(dirCmd == 'D') dirNum = 3;
        if(dirCmd == 'L') dirNum = 2; 
        return dirNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();

        int y = sc.nextInt();
        int x = sc.nextInt();
        int dirNum = getDirNum(sc.next().charAt(0));

        int[] dy = new int[] {-1, 0, 0, 1}; // 행
        int[] dx = new int[] {0, 1, -1, 0}; // 렬

        while(t-- > 0) {
            y += dy[dirNum];
            x += dx[dirNum];

            if(!inRange(x,y)) {
                y -= dy[dirNum];
                x -= dx[dirNum];
                dirNum = 3 - dirNum;
            } 
        // System.out.println();
        }

        System.out.printf("%d %d", y, x);

    }
}