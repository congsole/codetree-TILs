import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        int count = 1;
        int maxCount = 1;

        for(int i=0; i<n; i++) {
            if(i >= 1 && a[i] > a[i-1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);


    
    }

}