import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.close(); 

        System.out.print(haha(n, m));
    }
    public static int haha(int n, int m) {
        int result = 1;
        for(int i = 1; i <=n; i++) {
            if(n%i == 0 && m%i == 0) {
                result = i;
            }
        }
        return result;
    }
}