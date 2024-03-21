import java.util.*;

class Lectangle {
    int x1, x2;
    int y1, y2;

    public Lectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

public class Main {
    public static final int OFFSET = 100;
    public static int count = 0;
    public static void main(String[] args) {
        int[][] plane = new int[201][201];
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Lectangle[] nemo = new Lectangle[n];

        for(int i = 0; i < n; i++) {
            nemo[i] = new Lectangle(sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);
            for(int j = nemo[i].x1; j < nemo[i].x2; j++) {
                for(int k = nemo[i].y1; k < nemo[i].y2; k++) {
                    plane[j][k]++;
                }
            }
        }

        for(int i=0; i<201; i++) {
            for(int j=0; j<201; j++) {
                if(plane[i][j] > 0) {
                    count++;
                }
            }
        }

        System.out.print(count);

        
    }
}