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
        // System.out.println(aMin + " " + aMax);

        int maxCount = 0;
        for(int k=aMin+1; k<aMax; k++) {
        int count = 0;
            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(((a[i] < k && k < a[j]) || (a[i] > k && k > a[j])) && a[j]-k == k-a[i]) count++;
                }
            }
            maxCount = Math.max(count, maxCount);
        }

        System.out.print(maxCount);
        
    }
}