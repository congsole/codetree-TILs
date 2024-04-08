import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        int totalSum = 0;
        for(int i=0; i<6; i++) {
            array[i] = sc.nextInt();
            totalSum += array[i];
        }

        int minDiff = (1000000-1)*3;
        for(int i=0; i<4; i++) {
            for(int j=i+1; j<5; j++) {
                for(int k=j+1; k<6; k++) {
                    int sum1 = array[i] + array[j] + array[k];
                    int sum2 = totalSum - sum1;
                    int diff = Math.abs(sum1-sum2);
                    minDiff = Math.min(minDiff, diff);
                }
            }
        }
        System.out.print(minDiff);
    }
}