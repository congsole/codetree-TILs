import java.util.*;

public class Main {
    public static int[] a = new int[16];


    public static int getNth(int n) {
        if(n < 3) {
            return a[n];
        }
        return getNth(n/3) + getNth(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a[1] = 1;
        a[2] = 2;
        System.out.print(getNth(n));
    }
}