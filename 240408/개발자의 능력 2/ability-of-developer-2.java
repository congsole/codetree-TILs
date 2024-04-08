import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dv = new int[6];
        
        int totalSum = 0;
        for(int i=0; i<6; i++) {
            dv[i] = sc.nextInt();
            totalSum += dv[i];
        }
        int sum[] = new int[3];

        int minDiff = (1000000-1)*2;
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                for(int k=0; k<6; k++) {
                    for(int l=0; l<6; l++) {
                        if(i == j || i == k || i == l || j == k || j == l || k == l) continue;
                        sum[0] = dv[i] + dv[j];
                        sum[1] = dv[k] + dv[l];
                        sum[2] = totalSum - sum[0] - sum[1];
                        Arrays.sort(sum);
                        int diff = sum[2] - sum[0];
                        minDiff = Math.min(diff, minDiff);
                    }
                }
            }
        }

        System.out.print(minDiff);
        
    }
}