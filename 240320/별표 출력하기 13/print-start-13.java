import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i ++) {
            for(int j = 1; j <= n; j++) {
                if( i%2 == 1 && j <= n +(1-i)/2 ) {
                    System.out.print("* ");
                } else if( i%2 == 0 && j <= i/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i --) {
            for(int j = 1; j <= n; j++) {
                if( i%2 == 1 && j <= n +(1-i)/2 ) {
                    System.out.print("* ");
                } else if( i%2 == 0 && j <= i/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}