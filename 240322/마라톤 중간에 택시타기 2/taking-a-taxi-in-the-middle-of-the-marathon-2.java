import java.util.*;

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int offset = 1000;
    
    public static int distance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] p = new Point[n];

        for(int i=0; i<n; i++) {
            p[i] = new Point(sc.nextInt()+offset, sc.nextInt()+offset);
        }

        int minDistance = 4000;
        for(int i=1; i<n-1; i++) {
            int totalDistance = 0;
            for(int j=1; j<n; j++) {
                if(j == i + 1) {
                    totalDistance += distance(p[j-2], p[j]);
                } else if(j == i) {

                } else {
                    totalDistance += distance(p[j-1], p[j]);
                }
            }

            minDistance = Math.min(minDistance, totalDistance);
        }
        System.out.print(minDistance);


    }
}