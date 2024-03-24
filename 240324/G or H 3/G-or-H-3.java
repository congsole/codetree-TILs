import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[10000];

        for(int i=0; i<n; i++) {
            arr[sc.nextInt()] = sc.next().equals("G")? 1 : 2;
        }

        int maxSum = 0;

        for(int i=0; i<10000-k; i++) {
            int sum = 0;
            for(int j=i; j<=i+k; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);

    }
}