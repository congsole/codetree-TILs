import java.util.*;

public class Main {
    public static int N,M;
    public static int[][] matrix;

    public static boolean inRange(int x, int y) {
        return x>=0 && x<N && y>=0 && y<M;
    }

    public static boolean isSeparated(int h1, int w1, int i, int j, int h2, int w2, int n, int m) {
        for(int row1=i; row1<i+h1; row1++) 
            for(int col1=j; col1<j+w1; col1++)
                for(int row2=n; row2<n+h2; row2++) 
                    for(int col2=m; col2<m+w2; col2++) 
                        if(row1 == row2 && col1 == col2) return false;
        return true;
    }


    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        matrix = new int[N][M];
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                matrix[i][j] = sc.nextInt();
    
        int maxSum = -25*1000;
        //
        for(int h1=1; h1<=N; h1++) {
            for(int w1=1; w1<=M; w1++) {
                for(int i=0; i<N; i++) {
                    for(int j=0; j<M; j++) {
                        int sum1 = getSum(h1, w1, i, j);
                        for(int h2=1; h2<=N; h2++) {
                            for(int w2=1; w2<=M; w2++) {
                                for(int n=0; n<N; n++) {
                                    for(int m=0; m<M; m++) {
                                        if(isSeparated(h1, w1, i, j, h2, w2, n, m)) {
                                            int sum2 = getSum(h2, w2, n, m);
                                            maxSum = Math.max(maxSum, sum1 + sum2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        

        // output
        System.out.print(maxSum);
    }

    public static int getSum(int h, int w, int i, int j) {
        int sum = 0;

        for(int y=i; y<i+h; y++) {
            for(int x=j; x<j+w; x++) {
                if(inRange(y, x))
                sum += matrix[y][x];
            }
        }
    
        return sum;
    }
}