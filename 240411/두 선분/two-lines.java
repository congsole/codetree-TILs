import java.util.*;

public class Main {
    public static int x1, x2, x3, x4;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt(); // [x1, x2]  
        x2 = sc.nextInt();
        x3 = sc.nextInt(); // [x3, x4]
        x4 = sc.nextInt();

        if(x2 < x3 || x4 < x1) {
            System.out.print("nonintersecting");
        } else {
            System.out.print("intersecting");
        }

    }
}