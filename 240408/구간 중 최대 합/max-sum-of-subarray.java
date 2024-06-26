import java.util.*;

public class Main {
    public static int N, K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int maxSum = 0;
        for(int i=0; i<=N-K; i++) {
            int sum = 0;
            for(int j=i; j<i+K; j++) {
                sum += a[j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);
    }
}