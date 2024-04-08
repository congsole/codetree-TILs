import java.util.*;

public class Main {
    public static int jagui(int n, int cnt) {
        if(n == 1) {
            System.out.print(cnt);
            return 1;
        }
        return n % 2 == 0 ? jagui(n/2, ++cnt) : jagui(n/3, ++cnt);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        jagui(n, 0);
    }
}