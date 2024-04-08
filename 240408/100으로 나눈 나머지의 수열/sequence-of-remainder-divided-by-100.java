import java.util.*;

public class Main {

    public static int A(int n) {
        if(n == 1) return 2;
        if(n == 2) return 4;
        return A(n-1) * A(n-2) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(A(n));
    }
}