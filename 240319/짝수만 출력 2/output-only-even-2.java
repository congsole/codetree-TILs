import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int i = b%2==0? b : b-1;

        while(i>=a) {
            System.out.print(i + " ");
            i -= 2;
        }

    }
}