import java.util.*;

public class Main {

    public static int sum(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        return n + sum(n-2);
    }

    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.print(sum(N));
    }
}