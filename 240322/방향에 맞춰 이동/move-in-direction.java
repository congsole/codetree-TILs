import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;

        while(n-- > 0) {
            switch(sc.next().charAt(0)) {
                case 'W': x -= sc.nextInt(); break;
                case 'S': y -= sc.nextInt(); break;
                case 'N': y += sc.nextInt(); break;
                case 'E': x += sc.nextInt(); break;
            }
        }

        System.out.printf("%d %d", x, y);
    }
}