import java.util.*;

class Game {
    int x, y;
    public Game(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static List<Map<Integer, String>> list = new ArrayList<>();
    public static Game[] g;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        g = new Game[n];

        for(int i=0; i<n; i++) {
            g[i] = new Game(sc.nextInt(), sc.nextInt());
        }

        list.add(new HashMap<>());
        list.get(0).put(1, "가위");
        list.get(0).put(2, "바위");
        list.get(0).put(3, "보");
        list.add(new HashMap<>());
        list.get(1).put(1, "가위");
        list.get(1).put(2, "보");
        list.get(1).put(3, "바위");
        list.add(new HashMap<>());
        list.get(2).put(1, "바위");
        list.get(2).put(2, "가위");
        list.get(2).put(3, "보");
        list.add(new HashMap<>());
        list.get(3).put(1, "바위");
        list.get(3).put(2, "보");
        list.get(3).put(3, "가위");
        list.add(new HashMap<>());
        list.get(4).put(1, "보");
        list.get(4).put(2, "가위");
        list.get(4).put(3, "바위");
        list.add(new HashMap<>());
        list.get(5).put(1, "보");
        list.get(5).put(2, "바위");
        list.get(5).put(3, "가위");

        int maxCount = 0;
        for(Map<Integer, String> m : list) {
            int count = 0;
            for(int i=0; i<n; i++) {
                if(m.get(g[i].x).equals("가위") && m.get(g[i].y).equals("보")) count++;
                if(m.get(g[i].x).equals("바위") && m.get(g[i].y).equals("가위")) count++;
                if(m.get(g[i].x).equals("보") && m.get(g[i].y).equals("바위")) count++;
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);

        

    }
}