import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.close();
        dot(n,m);

    }
    public static void dot(int n, int m) {
        for(int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}