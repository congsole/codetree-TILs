import java.util.*;

public class Main {
    
    public static int N, K;
    public static int[] line = new int[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 바구니 갯수
        K = sc.nextInt(); // 구간 길이...곱하기2+1

        for(int i=0; i<N; i++) {
            int candy = sc.nextInt();
            int x = sc.nextInt();
            line[x] += candy;
        }

        int maxSum = 0;
        for(int i=K; i<101-K; i++) {
            int sum = 0;
            for(int j=i-K; j<=i+K; j++) {
                sum += line[j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);
    }
}