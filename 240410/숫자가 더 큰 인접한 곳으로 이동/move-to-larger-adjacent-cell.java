import java.util.*;


class Pair {
    int r, c;
    public Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class Main {
    public static int N;
    public static int[][] matrix;
    public static int[] dr = new int[]{-1, 1, 0, 0};
    public static int[] dc = new int[]{0, 0, -1, 1};
    public static int currRow, currCol;
    public static List<Integer> list = new ArrayList<>();
    
    public static boolean inRange(int r, int c) {
        return r>=0 && r<N && c>=0 && c<N;
    }
    
    public static void simulate() {
        while(true) {
            int currVal = matrix[currRow][currCol];
            for(int dir=0; dir<4; dir++) {
                int nextRow = currRow + dr[dir];
                int nextCol = currCol + dc[dir];
                if(inRange(nextRow, nextCol) && matrix[currRow][currCol] < matrix[nextRow][nextCol]) {
                    currRow = nextRow;
                    currCol = nextCol;
                    list.add(matrix[currRow][currCol]);
                    break;
                }
            }

            if(matrix[currRow][currCol] == currVal) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        currRow = sc.nextInt() - 1;
        currCol = sc.nextInt() - 1;
        matrix = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                matrix[i][j] = sc.nextInt();
        
        // 초기 설정
        list.add(matrix[currRow][currCol]);

        // 시뮬레이션
        simulate();

        // 출력
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}