import java.util.*;

public class Main {
    public static int A, B, x, y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        // i) 바로 이동
        int distance1 = Math.abs(B-A);

        // ii) 텔레포트 x를 통해 이동
        int distance2 = Math.abs(x-A) + Math.abs(B-y);

        // iii) 텔레포트 y를 통해 이동
        int distance3 = Math.abs(y-A) + Math.abs(B-x);

        System.out.print(Math.min(Math.min(distance1, distance2), distance3));
    }
}