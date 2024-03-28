import java.util.*;

public class Main {
    public static int N;
    public static int[][] matrix;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        matrix = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxSum = 0;
        for(int i=0; i<N-2; i++) {
            for(int j=0; j<N-2; j++) {
                int sum = 0;
                for(int k=i; k<i+3; k++) {
                    for(int l=j; l<j+3; l++) {
                        sum += matrix[k][l];
                    }
                }
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.print(maxSum);
    }
}