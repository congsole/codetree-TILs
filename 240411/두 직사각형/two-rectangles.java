import java.util.*;

public class Main {
    public static int x1, x2, y1, y2, a1, a2, b1, b2;
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

        if(x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1) System.out.print("nonoverlapping");
        else System.out.print("overlapping");
    }
}