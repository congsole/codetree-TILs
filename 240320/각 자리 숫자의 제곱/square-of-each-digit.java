import java.util.*;

public class Main {
    public static int f(int n) {
        if(n < 10) return n*n;
        return f(n/10) + (n%10)*(n%10);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }
}