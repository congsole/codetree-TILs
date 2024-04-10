import java.util.*;

public class Main {
    public static int N, T, currR, currC;
    public static int[] dr = new int[]{-1, 0, 1, 0};
    public static int[] dc = new int[]{0, 1, 0, -1};
    public static int[][] matrix;
    public static boolean inRange(int r, int c) {
        return r>=0 && r<N && c>=0 && c<N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 격자 크기
        T = sc.nextInt(); // 명령 갯수
        String str = sc.next();
        char[] cmd = str.toCharArray();
        matrix = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                matrix[i][j] = sc.nextInt();

        currR = currC = N/2;
        int sum = matrix[currR][currC];
        int dirNum = 0;

        for(int i=0; i<T; i++) {
            if(cmd[i] == 'F') {
                int nextR = currR + dr[dirNum];
                int nextC = currC + dc[dirNum];
                if(inRange(nextR, nextC)) {
                    currR = nextR;
                    currC = nextC;
                    sum += matrix[currR][currC];
                }
            } else if(cmd[i] == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else if(cmd[i] == 'L') {
                dirNum = (dirNum -1 + 4) % 4;
            }
        }

        System.out.print(sum);
        
    }
}