import java.util.*;

public class Main {
    public static int[] dn = new int[]{0, 0, 1, 1};
    public static int[] dm = new int[]{0, 1, 0, 1};
    public static int N, M;
    public static int[][] matrix;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();
        matrix = new int[N][M];
        for(int n=0; n<N; n++) {
            for(int m=0; m<M; m++) {
                matrix[n][m] = sc.nextInt();
            }
        }

        int maxSum = 0;
        // 일자 블럭 (1) 가로
        for(int i=0; i<N; i++) {
            for(int j=0; j<M-2; j++) {
                int sum = 0;
                for(int k=j; k<j+3; k++) {
                    sum += matrix[i][k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        // 일자 블럭 (2) 세로
        for(int j=0; j<M; j++) {
            for(int i=0; i<N-2; i++) {
                int sum = 0;
                for(int k=i; k<i+3; k++) {
                    sum += matrix[k][j];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        // ㅁ자 블럭 (한 위치만 빼고 4번 계산)
        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-1; j++) {
                int sumTemp = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                // System.out.println(i + " "+ j+ " "+ sumTemp);
                for(int dir=0; dir<4; dir++) {
                    int sum = sumTemp - matrix[i+dn[dir]][j+dm[dir]];
                    // System.out.println("    " + sum);
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }


        System.out.print(maxSum);
    }
}