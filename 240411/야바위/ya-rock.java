import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for(int i=0; i<n; i++) 
            for(int j=0; j<3; j++) 
                arr[i][j] = sc.nextInt() - 1;
        

        int maxScore = 0;
        for(int k=0; k<3; k++) {
            int score = 0;
            int[] cups = new int[3];
            cups[k] = 1;

            for(int i=0; i<n; i++) {
                int temp = cups[arr[i][0]];
                cups[arr[i][0]] = cups[arr[i][1]];
                cups[arr[i][1]] = temp;
                score += cups[arr[i][2]];
            }
            maxScore = Math.max(score, maxScore);
        }
        
        System.out.print(maxScore);
    }
}