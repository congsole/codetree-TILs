import java.util.*;

class Wind {
    int startRow, startCol, endRow, endCol;
    public Wind(int x, int y, int z, int w) {
        this.startRow = x;
        this.startCol = y;
        this.endRow = z;
        this.endCol = w;
    }
}

public class Main {
    public static int N,M,Q;
    public static int[][] matrix;
    public static int[][] matrixTemp;

    public static void rotate(Wind wind) {
        int temp = matrix[wind.startRow][wind.startCol];
        for(int row = wind.startRow; row < wind.endRow; row++)
            matrix[row][wind.startCol] = matrix[row + 1][wind.startCol];
        
        // Step1-3. 직사각형 가장 아래 행을 왼쪽으로 한 칸씩 shift 합니다.
        for(int col = wind.startCol; col < wind.endCol; col++)
            matrix[wind.endRow][col] = matrix[wind.endRow][col + 1];
    
        // Step1-4. 직사각형 가장 오른쪽 열을 아래로 한 칸씩 shift 합니다.
        for(int row = wind.endRow; row > wind.startRow; row--)
            matrix[row][wind.endCol] = matrix[row - 1][wind.endCol];
        
        // Step1-5. 직사각형 가장 위 행을 오른쪽으로 한 칸씩 shift 합니다.
        for(int col = wind.endCol; col > wind.startCol; col--)
            matrix[wind.startRow][col] = matrix[wind.startRow][col - 1];
    
        // Step1-6. temp를 가장 왼쪽 위 모서리를 기준으로 바로 오른쪽 칸에 넣습니다. 
        matrix[wind.startRow][wind.startCol + 1] = temp;
    }

    public static int average(int n, int m) {
        int[] dn = new int[]{0, 1, -1, 0, 0};
        int[] dm = new int[]{0, 0, 0, 1, -1};

        int sum = 0, cnt = 0;
        for(int dir = 0; dir < 5; dir++) {
            int nextN = n+ dn[dir], nextM = m + dm[dir];
            if(inRange(nextN, nextM)) {
                sum += matrix[nextN][nextM];
                cnt++;
            }
        }
        return sum/cnt;
    }

    public static boolean inRange(int x, int y) {
        return x>=0 && x<N && y>=0 && y<M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        matrix = new int[N][M];
        matrixTemp = new int[N][M];
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                matrix[i][j] = sc.nextInt();

        Wind[] wind = new Wind[Q];
        for(int i=0;i<Q;i++)
            wind[i] = new Wind(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt()-1, sc.nextInt()-1);

        for(int i=0;i<Q;i++) {
            rotate(wind[i]);
            for(int row=wind[i].startRow; row<=wind[i].endRow; row++) {
                for(int col=wind[i].startCol;col<=wind[i].endCol;col++) {
                    matrixTemp[row][col] = average(row, col);
                }
            }
            for(int row=wind[i].startRow; row<=wind[i].endRow; row++) {
                for(int col=wind[i].startCol;col<=wind[i].endCol;col++) {
                    matrix[row][col] = matrixTemp[row][col];
                }
            }
        }
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}