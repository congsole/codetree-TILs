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
    public static final int offset = 1000;
    public static void main(String[] args) {
        int[][] plane = new int[2001][2001];
        
        Scanner sc = new Scanner(System.in);
        Nemo[] nemo = new Nemo[2];
        for(int i=0; i<2; i++) {
            nemo[i] = new Nemo(sc.nextInt() + offset, sc.nextInt() + offset, sc.nextInt() + offset, sc.nextInt() + offset);
        }

        for(int i=nemo[0].x1; i<nemo[0].x2; i++) {
            for(int j=nemo[0].y1; j<nemo[0].y2; j++) {
                plane[i][j] = 1;
            }
        }
        for(int i=nemo[1].x1; i<nemo[1].x2; i++) {
            for(int j=nemo[1].y1; j<nemo[1].y2; j++) {
                plane[i][j] = 2;
            }
        }

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for(int i=nemo[0].x1; i<nemo[0].x2; i++) {
            for(int j=nemo[0].y1; j<nemo[0].y2; j++) {
                if(plane[i][j] == 1) {
                    x.add(i);
                    y.add(j);
                }
            }
        }

        int maxX = Collections.max(x);
        int minX = Collections.min(x);
        int maxY = Collections.max(y);
        int minY = Collections.min(y);

        System.out.print((maxX-minX+1)*(maxY-minY+1));
    }
}