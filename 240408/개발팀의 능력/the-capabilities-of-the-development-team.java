import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dv = new int[5];
        int[] sum = new int[3];

        int totalSum = 0;
        for(int i=0; i<5; i++) {
            dv[i] = sc.nextInt();
            totalSum += dv[i];
        }
        

        int minDiff = 999*2-1;
        boolean possible = false;
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                for(int k=0; k<5; k++) {
                    if(i == j || j == k || k == i) continue;
                    sum[0] = dv[i];
                    sum[1] = dv[j] + dv[k];
                    sum[2] = totalSum - sum[0] - sum[1];
                    if(sum[0] == sum[1] || sum[1] == sum[2] || sum[2] == sum[0]) continue;
                    possible = true;
                    Arrays.sort(sum);
                    int diff = sum[2] - sum[0];
                    minDiff = Math.min(minDiff, diff);
                }
            }
        }
        if(possible) System.out.print(minDiff);
        else System.out.print(-1);

    }
}