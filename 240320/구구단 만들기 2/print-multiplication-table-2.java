import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        for(int i = 2; i <= 8; i+=2) {
            for(int j = b; j >= a; j--) {
                if(j>a)
                System.out.printf("%d * %d = %d / ", j, i, j*i);
                else
                System.out.printf("%d * %d = %d", j, i, j*i);
            }
            System.out.println();
        }
    }
}