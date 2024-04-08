import java.util.*;

public class Main {
    public static int n;

    public static int factorial(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ans = factorial(n);
        System.out.print(ans);
    }
}