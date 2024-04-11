import java.util.*;

public class Main {
    public static int n, k;
    public static int[] a;

    public static int getCost(int minVal, int maxVal) {
        int cost = 0;
        for(int i=0; i<n; i++) {
            if(a[i] < minVal) cost += minVal - a[i];
            if(a[i] > maxVal) cost += a[i] - maxVal;
        }
        return cost;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 수의 갯수
        k = sc.nextInt(); // 최대 최소 간 차이의 상한선
        a = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        int minCost = 50*9999;
        
        for(int num=1; num<=10000-k; num++) { // 최소, 최대 구간을 잡아서 비용을 계산해본다.
            minCost = Math.min(minCost, getCost(num, num+k));
        }

        System.out.print(minCost);









        /*
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
        } */   
    }
}