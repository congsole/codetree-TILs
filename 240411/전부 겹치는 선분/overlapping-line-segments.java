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

        for(int x=1; x<=100; x++) {
            boolean overlapping = true;
            for(int i=0; i<n; i++) {
                if(l[i].start <= x && x <= l[i].end) {}
                else {
                    overlapping = false;
                    break;
                }
            }
            if(overlapping) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}