import java.util.Scanner;

public class Main {
    public static int N, M;
    public static boolean inRange(int x, int y) {
        return x>=0 && x<N && y>=0 && y<N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        int[][] matrix = new int[N][N];
        for(int i =0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        int maxCount = 0;
        for(int k=0; k<=N; k++) {
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    int goldCount = 0;
                    int yulCount = 0;
                    for(int n=i-k; n<=i+k; n++) {
                        for(int m=j-yulCount; m<=j+yulCount; m++) {
                            // System.out.printf("(%d ,%d)", n, m);
                            if(inRange(n,m) && matrix[n][m] == 1) {
                                goldCount++;
                            }
                        }    
                        // System.out.println("");
                        if(n<i) yulCount++;
                        else yulCount--;
                    }
                    int value = goldCount*M - k*k - (k+1)*(k+1);
                    if(value >= 0) {
                        maxCount = Math.max(goldCount, maxCount);
                    }
                }
            }
        }
        System.out.print(maxCount);

    }
}