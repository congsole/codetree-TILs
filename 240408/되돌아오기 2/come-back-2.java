import java.util.*;

public class Main {
    public static int[] dr = new int[]{-1, 0, 1, 0};
    public static int[] dc = new int[]{0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        int r = 0, c = 0;
        int dir = 0;
        int t = 0;
        for(int i=0; i<cmd.length(); i++) {
                t++;
            if(cmd.charAt(i) == 'F') {
                r += dr[dir];
                c += dc[dir];
                if(r == 0 && c == 0) {
                    System.out.print(t);
                    return;
                }
            }
            if(cmd.charAt(i) == 'R') {
                dir = (dir + 1) % 4;
            }
            if(cmd.charAt(i) == 'L') {
                dir = (dir -1 + 4) % 4;
            }
        }
        System.out.print(-1);
    }
}