import java.util.*;

public class Main {
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] a = new int[2*N];
        for(int i=0; i<2*N; i++) 
            a[i] = sc.nextInt();

        Arrays.sort(a);
        int maxSum = 0;
        for(int i=0; i<N; i++) {
            int sum = a[i] + a[2*N-1-i];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);
    }
}