import java.util.*;

class Line {
    int x1, x2;
    int y1, y2;
    public Line(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = 0;
        this.y2 = 1;
    }
}

public class Main {
    public static int N;
    public static List<Line> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0; i<N; i++)
            list.add(new Line(sc.nextInt(), sc.nextInt()));

        // 안겹치는 경우? 먼저 시작해서 먼저 끝나는 경우, 늦게 시작해서 늦게 끝나는 경우
        int count = 0;
        loop1 : for(int i=0; i<N; i++) {
            boolean cross = false;
            for(int j=0; j<N; j++) {
                if(i == j) continue;
                Line li = list.get(i);
                Line lj = list.get(j);

                if((lj.x1 < li.x1 && lj.x2 < li.x2) || (lj.x1 > li.x1 && lj.x2 > li.x2)) {
                } else {
                    cross = true;
                    continue loop1;
                }
            }
            if(!cross) {
                count++;
            }
        }
        System.out.print(count);

    }
}