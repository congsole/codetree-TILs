import java.util.*;



public class Main {
    static class Rectangle {
        int r1, c1, r2, c2;
        public Rectangle(int r1, int c1, int r2, int c2) {
            this.r1 = r1 + OFFSET;
            this.c1 = c1 + OFFSET;
            this.r2 = r2 + OFFSET;
            this.c2 = c2 + OFFSET;
        }
    }
    public static int N;
    public static int[][] matrix;
    public static final int OFFSET = 200;
    public static void main(String[] args) {
        matrix = new int[400][400];
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Rectangle[] rtg = new Rectangle[N];
        for(int i=0; i<N; i++) {
            rtg[i] = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        for(int i=0; i<N; i++) {
     
            for(int n=rtg[i].r1; n<rtg[i].r2; n++) {
                for(int m=rtg[i].c1; m<rtg[i].c2; m++) {
                    if(i % 2 == 0) {
                        matrix[n][m] = 0;
                    } else {
                        matrix[n][m] = 1;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0; i<400; i++) {
            for(int j=0; j<400; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.print(sum);

    }
}