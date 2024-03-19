import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(mock(n));
    }

    public static int mock(int n) {
        int sum = 0;
        int result = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        result = sum/10;

        return result;
    }
}