import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        
        int hMax = 0;
        int hMin = 1000;
        for(int i=0; i<n; i++) {
            h[i] = sc.nextInt();
            hMax = Math.max(hMax, h[i]);
            hMin = Math.min(hMin, h[i]);
        }

        int maxCount = 0;
        for(int y=hMin; y<hMax; y++) {
            int count = 0;
            for(int i=0; i<n; i++) {
                if(i == 0 && h[i] > y) count++;
                else if(h[i] > y && h[i-1] <= y) count++;
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);

    }
}