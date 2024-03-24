import java.util.*;

public class Main {

    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        int[][] matrix = new int[N][N];
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxCount = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N-2; j++) {
                int count = 0;
                int count1 = 0;
                for(int x=0; x<3; x++) {
                    if(matrix[i][j+x] == 1) {
                        count1++;
                    }
                }

                for(int k=0; k<N; k++) {
                    for(int l=0; l<N-2; l++) {
                        int count2 = 0;
                        if(k>i || l>j+2) {
                            for(int x=0; x<3; x++) {
                                if(matrix[k][l+x] == 1) {
                                    count2++;
                                }
                            }
                        }
                        count = count1 + count2;
                    }
                    maxCount = Math.max(maxCount, count);
                }
            }
        }

        System.out.print(maxCount);
    }
}