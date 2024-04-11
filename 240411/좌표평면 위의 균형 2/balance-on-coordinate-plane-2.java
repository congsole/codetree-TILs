import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[101][101];

        for(int i=0; i<n; i++)
            matrix[sc.nextInt()][sc.nextInt()] = 1;
        
        int minMax = 100;
        for(int i=0; i<=100; i+=2) {
            for(int j=0; j<=100; j+=2) {
                int d1 = 0, d2 = 0, d3 = 0, d4 = 0;
                for(int x=0; x<i; x++) {
                    for(int y=0; y<j; y++) {
                        d1 += matrix[x][y];
                    }
                }
                for(int x=0; x<i; x++) {
                    for(int y=j; y<=100; y++) {
                        d2 += matrix[x][y];
                    }
                }
                for(int x=i; x<=100; x++) {
                    for(int y=0; y<j; y++) {
                        d3 += matrix[x][y];
                    }
                }
                for(int x=i; x<=100; x++) {
                    for(int y=j; y<=100; y++) {
                        d4 += matrix[x][y];
                    }
                }
                int max = Math.max(Math.max(Math.max(d1, d2), d3), d4);
                minMax = Math.min(minMax, max);
            }
        }
        System.out.print(minMax);
    }
}