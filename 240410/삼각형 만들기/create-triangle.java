import java.util.*;

class Point {
    int r, c;
    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class Main {
    public static int N;
    public static List<Point> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0; i<N; i++) {
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }


        int sMax = 0;
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int k=j+1; k<N; k++) {
                    Point p1 = list.get(i);
                    Point p2 = list.get(j);
                    Point p3 = list.get(k);
                    // System.out.println(p1.r + " " + p2.r + " " + p3.r + " / " + p1.c + " " + p2.c + " " + p3.c);
                    if(
                    (p1.r == p2.r && p2.r == p3.r && p3.r == p1.r) || (p1.c == p2.c && p2.c == p3.c && p3.c == p1.c)
                    || (p1.r != p2.r && p2.r != p3.r && p3.r != p1.r) || (p1.c != p2.c && p2.c != p3.c && p3.c != p1.c)
                    ) continue;
                    
                    int s = Math.max(Math.abs(p1.r-p2.r), Math.abs(p2.r-p3.r)) * Math.max(Math.abs(p1.c-p2.c), Math.abs(p2.c-p3.c));
                    sMax = Math.max(s, sMax);
                    
                }
            }
        }
        System.out.print(sMax);
    }
}