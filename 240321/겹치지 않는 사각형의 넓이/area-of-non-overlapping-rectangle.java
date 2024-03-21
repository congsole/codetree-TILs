import java.util.*;

class Nemo {
    int x1, x2;
    int y1, y2;

    public Nemo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

public class Main {
    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        int[][] plane = new int[2001][2001];
        
        Scanner sc = new Scanner(System.in);
        Nemo[] nemo = new Nemo[3];
        for(int i=0; i<3; i++) {
            nemo[i] = new Nemo(sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);
        }

        for(int i=0; i<3; i++) {
            for(int j=nemo[i].x1; j<nemo[i].x2; j++) {
                for(int k=nemo[i].y1; k<nemo[i].y2; k++) {
                    if(i == 2) {
                        plane[j][k] = 2;
                    } else {
                        plane[j][k] = 1;
                    }
                }
            }
        }

        int count = 0;

        for(int i=0; i<2001; i++) {
            for(int j=0; j<2001; j++) {
                if(plane[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}