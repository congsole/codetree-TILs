import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dirNum = 3; // x축의 양수쪽부터 0방향. 시계반방향으로 방향 설정. 현재 북쪽 향하고 있음.

        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, -1, 0, 1};
        int x = 0, y = 0, temp = 0;

        String command = sc.next();
        // rotation direction
        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'R') {
                dirNum = (dirNum +1) % 4;
                // temp = x;
                // x = y;
                // y = -temp;
            } else if(command.charAt(i) == 'L') {
                dirNum = (dirNum -1 + 4) % 4;
                // temp = x;
                // x = -y;
                // y = temp;
                // 원점을 기준으로 회전하는게 아닌 서있는 자리에서 방향전환만 한다.
            } else {
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        System.out.printf("%d %d", x, y);

    }
}