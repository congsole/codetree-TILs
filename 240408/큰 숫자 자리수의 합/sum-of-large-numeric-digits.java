import java.util.*;

public class Main {

    public static int f(int num, int n) {
        if(num < 10) {
            return num;
        }
        return num/(int)(Math.pow(10, n)) + f(num%(int)(Math.pow(10, n)), n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a * b * c;
        int n = 10;
        System.out.print(f(sum, n));
    }
}