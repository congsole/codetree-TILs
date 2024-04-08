import java.util.*;

public class Main {
    public static int N;
    
    public static int F(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return F(n-1) + F(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        System.out.print(F(N));

    }
}