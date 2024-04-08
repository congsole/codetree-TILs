import java.util.*;

public class Main {
    public static int N, H, T;
    public static int[] line;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = sc.nextInt();
        T = sc.nextInt();

        line = new int[N];
        for(int i=0; i<N; i++)
            line[i] = sc.nextInt();

        int minCost = 200*100;
        for(int i=0; i<=N-T; i++) {
            int cost = 0;
            for(int j=i; j<i+T; j++) {
                cost += Math.abs(line[j]-H);
            }
            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);


    }
}