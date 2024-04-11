import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n+1];
        for(int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }


        int maxSum = 0;
        for(int i=1; i<=n; i++) {
            int sum = 0;
            int index = i;
            for(int j=0; j<m; j++) {
                sum += index;
                index = a[index];
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);
    }
}