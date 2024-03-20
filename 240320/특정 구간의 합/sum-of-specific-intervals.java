import java.util.*;

public class Main {
    
    public static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), m = sc.nextInt();
        
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            int q = sc.nextInt()-1;
            int w = sc.nextInt()-1;
            int sum = 0;
            for(int j = q; j<=w; j++) {
                sum += a[j];
            }
            System.out.println(sum);
        }



    }
}