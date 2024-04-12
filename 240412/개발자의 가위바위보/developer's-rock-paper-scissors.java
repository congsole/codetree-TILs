import java.util.*;

class Game {
    int x, y;
    public Game(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// 가위바위보는 하나가 나머지 두 개 중 하나를 무조건 이김. 따라서 두 가지 경우밖에 나오지 않는다는 해설이 맞다.
public class Main {
    // public static List<Map<Integer, String>> list = new ArrayList<>();
    public static Game[] g;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        g = new Game[n];

        for(int i=0; i<n; i++) {
            g[i] = new Game(sc.nextInt(), sc.nextInt());
        }

        // i) 1이 2를 이기고 2가 3을 이기고 3이 1을 이기는 경우
        int counti = 0;
        for(int i=0; i<n; i++) {
            if(g[i].x == 1 && g[i].y == 2) counti++;
            if(g[i].x == 2 && g[i].y == 3) counti++;
            if(g[i].x == 3 && g[i].y == 1) counti++;
        }

        // ii) 1이 3을 이기고 3이 2를 이기고 2가 1을 이기는 경우
        int countii = 0;
        for(int i=0; i<n; i++) {
            if(g[i].x == 1 && g[i].y == 3) countii++;
            if(g[i].x == 3 && g[i].y == 2) countii++;
            if(g[i].x == 2 && g[i].y == 1) countii++;
        }

        System.out.print(Math.max(counti, countii));

        // list.add(new HashMap<>());
        // list.get(0).put(1, "가위");
        // list.get(0).put(2, "바위");
        // list.get(0).put(3, "보");
        // list.add(new HashMap<>());
        // list.get(1).put(1, "가위");
        // list.get(1).put(2, "보");
        // list.get(1).put(3, "바위");
        // list.add(new HashMap<>());
        // list.get(2).put(1, "바위");
        // list.get(2).put(2, "가위");
        // list.get(2).put(3, "보");
        // list.add(new HashMap<>());
        // list.get(3).put(1, "바위");
        // list.get(3).put(2, "보");
        // list.get(3).put(3, "가위");
        // list.add(new HashMap<>());
        // list.get(4).put(1, "보");
        // list.get(4).put(2, "가위");
        // list.get(4).put(3, "바위");
        // list.add(new HashMap<>());
        // list.get(5).put(1, "보");
        // list.get(5).put(2, "바위");
        // list.get(5).put(3, "가위");

        // int maxCount = 0;
        // for(Map<Integer, String> m : list) {
        //     int count = 0;
        //     for(int i=0; i<n; i++) {
        //         if(m.get(g[i].x).equals("가위") && m.get(g[i].y).equals("보")) count++;
        //         if(m.get(g[i].x).equals("바위") && m.get(g[i].y).equals("가위")) count++;
        //         if(m.get(g[i].x).equals("보") && m.get(g[i].y).equals("바위")) count++;
        //     }
        //     maxCount = Math.max(maxCount, count);
        // }

        // System.out.print(maxCount);

        

    }
}