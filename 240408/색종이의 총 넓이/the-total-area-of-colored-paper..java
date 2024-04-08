import java.util.*;


public class Main {
    static class Point {
        int r, c;
        public Point(int r, int c) {
            this.r = r + OFFSET;
            this.c = c + OFFSET;
        }
    }
    public static int N;
    public static int[][] matrix;
    public static final int OFFSET = 200;
    public static void main(String[] args) {
        matrix = new int[400][400];
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Point[] p = new Point[N];
        for(int i=0; i<N; i++)
            p[i] = new Point(sc.nextInt(), sc.nextInt());

        for(int i=0; i<N; i++) {
            for(int r=p[i].r; r>p[i].r-8; r--) {
                for(int c=p[i].c; c<p[i].c+8; c++) {
                    if(r<0 || c<0) System.out.println(r + " "+ c);
                    if(r>0 && c>0) matrix[r][c] = 1;
                }
            }
        }
        int sum = 0;
        for(int i=0; i<400; i++) {
            for(int j=0; j<400; j++) {
                sum += matrix[i][j];            }
        } 
        System.out.print(sum);
    }
}