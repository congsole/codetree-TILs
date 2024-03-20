import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int m = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i%2 == 1) {
                    System.out.print(++m + " ");
                } else {
                    m += 2;
                    System.out.print(m + " ");
                }
            }
            System.out.println();
        }
    }
}