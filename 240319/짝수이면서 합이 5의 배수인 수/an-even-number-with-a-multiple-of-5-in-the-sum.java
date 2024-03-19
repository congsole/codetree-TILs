import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(five(n));
        
    }
    public static String five(int n) {
        int a = n/10;
        int b = n%10;
        return (a + b)%5 == 0 ? "Yes" : "No";
    }
}