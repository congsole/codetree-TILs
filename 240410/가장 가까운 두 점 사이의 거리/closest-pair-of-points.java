import java.util.*;

class Point {
    int r, c;
    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class Main {
    
    public static int distanceSquare(Point p, Point o) {
        return (p.r-o.r)*(p.r-o.r) + (p.c-o.c)*(p.c-o.c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        int minDistance = 2*1000*1000;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) continue;
                int distance = distanceSquare(list.get(i), list.get(j));
                minDistance = Math.min(distance, minDistance);
            }
        }

        System.out.print(minDistance);

    }
}