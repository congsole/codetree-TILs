import java.util.*;

public class Main {
    public static int N;
    public static int[] h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        h = new int[N];

        for(int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);
        int minH = h[0];
        int maxH = h[N-1];

        int minCost = 83*83*1000;
        for(int minh=minH; minh<=maxH; minh++) {
            int cost = 0;
            for(int i=0; i<N; i++) {
                if(h[i] < minh) {
                    cost += (minh-h[i]) * (minh-h[i]);
                }
                if(h[i] > minh+17) {
                    cost += (h[i] - minh -17) * (h[i] - minh -17);
                }
            }
            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);
    }
}