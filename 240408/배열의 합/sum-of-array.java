import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        
        int[][] arr = new int[4][4];
        int[] sum = new int[4];
        for(int i = 0; i<4; i++) {
            for(int j=0; j<4; j++) {
                arr[i][j] = s.nextInt();
            }
            for(int j=0; j<4; j++) {
                sum[i] += arr[i][j];
            }
        }

        for(int i = 0; i<4; i++) {
            System.out.println(sum[i]);
        }

        
        
        s.close();
    }
}