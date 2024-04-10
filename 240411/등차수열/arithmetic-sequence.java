import java.util.*;

public class Main {
    public static int n;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        
        int aMin = 100;
        int aMax = 1;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            aMin = Math.min(aMin, a[i]);
            aMax = Math.max(aMax, a[i]);
        }

        int count = 0;
        for(int k=aMin+1; k<aMax; k++) {
            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(a[j]-k == k-a[i]) count++;
                }
            }
        }

        System.out.print(count);
        
    }
}