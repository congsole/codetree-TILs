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

        int min = 40000*40000;
        for(int i=0; i<N; i++) {
            List<Point> tempList = new ArrayList<>();
            for(int j=0; j<N; j++) {
                if(i == j) continue;
                tempList.add(list.get(j));
            }
            Collections.sort(tempList, (a, b) -> a.r - b.r);
            int h = tempList.get(N-2).r - tempList.get(0).r;
            Collections.sort(tempList, (a, b) -> a.c - b.c);
            int w = tempList.get(N-2).c - tempList.get(0).c;
            min = Math.min(h*w, min);
        }

        System.out.print(min);
    }
}