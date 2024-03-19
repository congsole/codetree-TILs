import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        System.out.print(minimum(a, b, c));
    }
    public static int minimum(int a, int b, int c) {
        int m = a;
        if(m>b) {
            m = b;
        }
        if(m>c) {
            m = c;
        }
        return m;
    }
}