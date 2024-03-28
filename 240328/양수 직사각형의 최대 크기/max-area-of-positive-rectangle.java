import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxSize = -1;
        int height = 1;
        while(height <= n) {
            int width = 1;
            while(width <= m) {
                for(int i=0; i<n-height+1; i++) {
                    for(int j=0; j<m-width+1; j++) {
                        boolean allPositive = true;
                        loop1 : for(int k=i; k<i+height; k++) {
                            for(int l=j; l<j+width; l++) {
                                if(grid[k][l] <= 0) {
                                    allPositive = false;
                                    break loop1;
                                }

                            }
                        }
                        if(allPositive)
                        maxSize = Math.max(maxSize, height*width);
                    }
                }
                width++;
            }
            height++;
        }

        System.out.print(maxSize);
    }
}