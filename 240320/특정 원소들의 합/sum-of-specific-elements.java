import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                if(j <= i) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.print(sum);

    }
}