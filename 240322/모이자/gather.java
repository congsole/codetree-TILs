import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] house = new int[n];
        int[] sum = new int[n];
        for(int i = 0; i < n; i++) {
            house[i] = sc.nextInt();
        }

        int total = 0;

        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i != j) {
                    sum[i] += Math.abs(i-j) * house[j];
                }
            }
        }
        Arrays.sort(sum);
        System.out.print(sum[0]);
    }
}