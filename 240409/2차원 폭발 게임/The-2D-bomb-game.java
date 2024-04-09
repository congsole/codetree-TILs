import java.util.*;

public class Main {
    public static int N, M, K;
    public static int[][] matrix;
    public static int[][] temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        matrix = new int[N][N];
        temp = new int[N][N];

        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                matrix[i][j] = sc.nextInt();

        int turn = 1;
        while(turn <= K) {
            for(int j=0; j<N; j++) {
                int rowNum1 = 0;
                int rowNum2 = 0;
                int keepNum = matrix[0][j];
                for(int i=1; i<N; i++) {
                    if(keepNum == matrix[i][j]) {
                        rowNum2 = i;
                    } else {
                        if(rowNum2-rowNum1 + 1 >= M) {
                            for(int row=rowNum1; row<=rowNum2; row++) {
                                matrix[row][j] = 0;
                            }
                        }
                        keepNum = matrix[i][j];
                        rowNum1 = i;
                    }
                    if(i == N-1 && rowNum2-rowNum1 + 1 >= M) {
                        for(int row=rowNum1; row<=rowNum2; row++) {
                                matrix[row][j] = 0;
                        }
                    }
                }
            }
            // 떨구기
            for(int i=0; i<N; i++)
                for(int j=0; j<N; j++)
                    temp[i][j] = 0;

            for(int j=0; j<N; j++) {
                int rowNum = N-1;
                for(int i=N-1; i>=0; i--) {
                    if(matrix[i][j] == 0) continue;
                    temp[rowNum--][j] = matrix[i][j];
                }
            }
            for(int i=0; i<N; i++)
                for(int j=0; j<N; j++)
                    matrix[i][j] = temp[i][j];

            // 회전        
            for(int i=0; i<N; i++)
                for(int j=0; j<N; j++)
                    temp[i][j] = 0;
            for(int i=0; i<N; i++) 
                for(int j=0; j<N; j++) 
                    temp[i][j] = matrix[N - j - 1][i];
            
            // 또 떨구기
            for(int i=0; i<N; i++)
                for(int j=0; j<N; j++)
                    matrix[i][j] = 0;
            for(int j=0; j<N; j++) {
                int rowNum = N-1;
                for(int i=N-1; i>=0; i--) {
                    if(temp[i][j] == 0) continue;
                    matrix[rowNum--][j] = temp[i][j];
                }
            }
            turn++;
        }
        for(int j=0; j<N; j++) {
                int rowNum1 = 0;
                int rowNum2 = 0;
                int keepNum = matrix[0][j];
                for(int i=1; i<N; i++) {
                    if(keepNum == matrix[i][j]) {
                        rowNum2 = i;
                    } else {
                        if(rowNum2-rowNum1 + 1 >= M) {
                            for(int row=rowNum1; row<=rowNum2; row++) {
                                matrix[row][j] = 0;
                            }
                        }
                        keepNum = matrix[i][j];
                        rowNum1 = i;
                    }
                    if(i == N-1 && rowNum2-rowNum1 + 1 >= M) {
                        for(int row=rowNum1; row<=rowNum2; row++) {
                                matrix[row][j] = 0;
                        }
                    }
                }
            }
            // 떨구기
            for(int i=0; i<N; i++)
                for(int j=0; j<N; j++)
                    temp[i][j] = 0;

            for(int j=0; j<N; j++) {
                int rowNum = N-1;
                for(int i=N-1; i>=0; i--) {
                    if(matrix[i][j] == 0) continue;
                    temp[rowNum--][j] = matrix[i][j];
                }
            }
            for(int i=0; i<N; i++)
                for(int j=0; j<N; j++)
                    matrix[i][j] = temp[i][j];

        int count = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(matrix[i][j] != 0) count++;
            }
        }
        System.out.print(count);
    }
}