import java.util.*;

public class Main {
    public static int n, k;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 수의 갯수
        k = sc.nextInt(); // 최대 최소 간 차이의 상한선
        a = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        int cost = 0;
        while(true) {
            Arrays.sort(a);
            int min = a[0];
            int max = a[n-1];
            if(max-min == k) {
                System.out.print(cost);
                return;
            }
            int minCount = 0;
            int maxCount = 0;
            for(int i=0; i<n; i++) {
                if(a[i] == a[0]) minCount++;
                if(a[i] == a[n-1]) maxCount++;
            }
            if(minCount>maxCount) {
                for(int i=n-1; i>n-1-maxCount; i--) {
                    a[i]--;
                    cost++;
                }
            } else {
                for(int i=0; i<minCount; i++) {
                    a[i]++;
                    cost++;
                }
            }
        }    
    }
}