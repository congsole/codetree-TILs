import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int count = 1;
        int maxCount = 1;
        int[] a = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            if(i>0 && a[i]>t && a[i-1]>t) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(count, maxCount);
        }

        System.out.print(maxCount);
    }
}