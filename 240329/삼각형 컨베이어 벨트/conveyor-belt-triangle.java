import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[3*n];
        for(int i=0;i<3*n;i++) {
            a[i] = sc.nextInt();
        }

        while(t > 0) {
            int temp = a[3*n-1];
            for(int i=3*n-1; i>=1; i--)
                a[i] = a[i-1];
            a[0] = temp;
            
            t--;
        }

        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i=n; i<2*n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i=2*n; i<3*n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}