import java.util.*;

public class Main {
    public static int n;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[2*n];
        for(int i=0; i<2*n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int minValue = a[2*n-1] - a[0];

        for(int i=0; i<n; i++) {
            minValue = Math.min(a[i+n] - a[i], minValue);
        }

        System.out.print(minValue);
    }
}