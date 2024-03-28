import java.util.*;

public class Main {
    public static int N, M;
    public static int[][] matrix;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        matrix = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int countN = 0;
        for(int n=0; n<N; n++) {
            int count = 1;
            for(int m=1; m<N; m++) {
                if(M == 1) {
                    countN++;
                    break;
                }
                if(matrix[n][m] == matrix[n][m-1]) {
                    count++;
                    if(count == M) {
                    countN++;
                    break;
                }
                } else {
                    count = 1;
                }
            }
        }
        
        int countM = 0;
        for(int m=0; m<N; m++) {
            int count = 1;
            for(int n=1; n<N; n++) {
                  if(M == 1) {
                    countM++;
                    break;
                }
                if(matrix[n][m] == matrix[n-1][m]) {
                    count++;
                    if(count == M) {
                    countM++;
                    break;
                }
                } else {
                    count = 1;
                }
            }
        }
        System.out.print(countN + countM);
    }
}