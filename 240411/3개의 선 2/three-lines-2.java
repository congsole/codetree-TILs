import java.util.*;

class Point {
    int x, y;
    boolean cross;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        boolean cross = false;
    }
    public void isCross(char xy, int value) {
        if(xy == 'x' && this.x == value) {
            cross = true;
        } else if(xy == 'y' && this.y == value) {
            cross = true;
        }
    }
}

class Combination {
    char i, j, k;
    public Combination(char i, char j, char k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Point> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        int minX = 10000, minY = 10000;
        int maxX = 0, maxY = 0;

        List<Combination> cList = new ArrayList<>();
        for(char i='x'; i<='y'; i++) {
            for(char j='x'; j<='y'; j++) {
                for(char k='x'; k<='y'; k++) {
                    cList.add(new Combination(i, j, k));
                }
            }
        }
        for(Combination c : cList) {
            for(int q=0; q<=10; q++) {
                for(int w=0; w<=10; w++) {
                    for(int e=0; e<=10; e++) {
                        boolean allCross = true;
                        for(Point p : list) {
                            p.cross = false;
                            p.isCross(c.i, q);
                            p.isCross(c.j, w);
                            p.isCross(c.k, e);
                        }
                        for(Point p : list) {
                            if(!p.cross) allCross = false;
                        }
                        if(allCross) {
                            System.out.print(1);
                            return;
                        }
                            
                    }
                }
            }
        }
        System.out.print(0);

    }
}