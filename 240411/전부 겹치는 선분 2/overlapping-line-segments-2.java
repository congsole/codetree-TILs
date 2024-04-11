import java.util.*;

class Line {
    int start, end;
    public Line(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class Main {
    public static int n;
    public static Line[] l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = new Line[n];
        for(int i=0; i<n; i++) {
            l[i] = new Line(sc.nextInt(), sc.nextInt());
        }

        for(int i=0; i<n; i++) {
            int max_x1 = 1, min_x2 = 100;
            for(int j=0; j<n; j++) {
                if(i == j) continue;
                max_x1 = Math.max(max_x1, l[j].start);
                min_x2 = Math.min(min_x2, l[j].end);
            }
            if(max_x1 <= min_x2) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}