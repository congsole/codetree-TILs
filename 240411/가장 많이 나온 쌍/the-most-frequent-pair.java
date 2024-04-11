import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for(int i=0; i<m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int maxCount = 0;
        for(int i=0; i<m; i++) {
            int samePairCount = 1;
            for(int j=i+1; j<m; j++) {
                if((arr[i][0] == arr[j][0] && arr[i][1] == arr[j][1]) || (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0])) {
                    samePairCount++;
                }
            }
            maxCount = Math.max(maxCount, samePairCount);
        }
        System.out.print(maxCount);
    }
}