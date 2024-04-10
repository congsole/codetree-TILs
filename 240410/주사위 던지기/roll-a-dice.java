import java.util.*;

public class Main {
    public static int N, M;
    public static int currR, currC;
    public static int[][] matrix;
    public static Map<String, Integer> map = new HashMap<>();
    public static boolean inRange(int r, int c) {
        return r>=0 && r<N && c>=0 && c<N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        currR = sc.nextInt() - 1;
        currC = sc.nextInt() - 1;
        matrix = new int[N][N];

        map.put("up", 1);
        map.put("down", 6);
        map.put("right", 3);
        map.put("left", 4);
        map.put("front", 2);
        map.put("back", 5);

        matrix[currR][currC] = map.get("down");

        int turn = 1;
        while(turn <= M) {
            char cmd = sc.next().charAt(0);
            if(cmd == 'L') {
                int nextR = currR;
                int nextC = currC-1;
                if(inRange(nextR, nextC)) {
                    currR = nextR;
                    currC = nextC;
                    int down = map.get("down");
                    map.put("down", map.get("left"));
                    map.put("left", map.get("up"));
                    map.put("up", map.get("right"));
                    map.put("right", down);
                    matrix[currR][currC] = map.get("down");
                }
            } else if(cmd == 'R') {
                int nextR = currR;
                int nextC = currC+1;
                if(inRange(nextR, nextC)) {
                    currR = nextR;
                    currC = nextC;
                    int down = map.get("down");
                    map.put("down", map.get("right"));
                    map.put("right", map.get("up"));
                    map.put("up", map.get("left"));
                    map.put("left", down);
                    matrix[currR][currC] = map.get("down");
                }
            } else if(cmd == 'D') {
                int nextR = currR+1;
                int nextC = currC;
                if(inRange(nextR, nextC)) {
                    currR = nextR;
                    currC = nextC;
                    int down = map.get("down");
                    map.put("down", map.get("front"));
                    map.put("front", map.get("up"));
                    map.put("up", map.get("back"));
                    map.put("back", down);
                    matrix[currR][currC] = map.get("down");
                }
            } else if(cmd == 'U') {
                int nextR = currR-1;
                int nextC = currC;
                if(inRange(nextR, nextC)) {
                    currR = nextR;
                    currC = nextC;
                    int down = map.get("down");
                    map.put("down", map.get("back"));
                    map.put("back", map.get("up"));
                    map.put("up", map.get("front"));
                    map.put("front", down);
                    matrix[currR][currC] = map.get("down");
                }
            }
            turn++;
        }
        int sum = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.print(sum);
    }
}