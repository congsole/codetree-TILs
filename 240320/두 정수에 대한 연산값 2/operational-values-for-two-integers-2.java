import java.util.*;
public class Main {
    static int a = 0, b = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b) {
            a = max(a);
            b = min(b);
        } else {
            a = min(a);
            b = max(b);
        }
        
        System.out.printf("%d %d", a, b);
    }
    static int max(int n) {
        return n*2;
    }
    static int min(int m) {
        return m + 10;
    }
}