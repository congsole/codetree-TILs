import java.util.*;

public class Main {
    
    public static int count = 0;
    public static int f(int n) {
        if(n == 1) return 1;
        count++;
        return n % 2 == 0 ? f(n/2) : f(3*n +1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
        System.out.print(count);
    }
}