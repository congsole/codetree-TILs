import java.util.*;

public class Main {
    public static int N, M, K;
    public static int[][] matrix;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 격자의 크기
        M = sc.nextInt(); // 블럭의 너비
        K = sc.nextInt() - 1; // 블럭이 떨어질 열 중 첫번째 

        matrix = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                matrix[i][j] = sc.nextInt();

        int minRow = N - 1;
        for(int j=K; j<K+M; j++) {
            for(int i=0; i<N; i++) {
                if(matrix[i][j] == 1) {
                    minRow = Math.min(i-1, minRow);
                    break;
                }
            }
        }
        for(int j=K; j<K+M; j++) {
            matrix[minRow][j] = 1;
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}