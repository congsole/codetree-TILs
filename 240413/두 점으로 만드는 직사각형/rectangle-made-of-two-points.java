import java.util.*;

public class Main {
    public static int x1, y1, x2, y2;
    public static int a1, b1, a2, b2;
    public static int i1, j1, i2, j2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt(); // 좌측 하단
        y1 = sc.nextInt();

        x2 = sc.nextInt(); // 우측 상단
        y2 = sc.nextInt();

        a1 = sc.nextInt(); // 좌측 하단
        b1 = sc.nextInt();

        a2 = sc.nextInt(); // 우측 상단
        b2 = sc.nextInt();

        i1 = Math.min(x1, a1);
        j1 = Math.min(y1, b1);
        i2 = Math.max(x2, a2);
        j2 = Math.max(y2, b2);

        int s = (i2 - i1) * (j2 - j1);

        System.out.print(s);
        



    }
}