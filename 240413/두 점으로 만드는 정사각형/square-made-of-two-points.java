import java.util.*;

public class Main {
    public static int x1, y1, x2, y2, a1, b1, a2, b2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();

        int w = Math.max(x2, a2) - Math.min(x1, a1);
        int h = Math.max(y2, b2) - Math.min(y1, b2);
        int side = Math.max(w, h);

        System.out.print(side*side);

    }
}