import java.util.*;

class Wind {
    int row;
    char dir;
    public Wind(int row, String dir) {
        this.row = row-1;
        this.dir = dir.charAt(0);
    }
}
public class Main {
    
    public static int n, m, q;
    public static int[][] matrix;
    public static char[] dir = new char[]{'L', 'R'};
    
    public static void push(int rowNum, int dirNum) {
        if(dirNum == 0) {
            int temp = matrix[rowNum][m-1];
            for(int j=m-1;j>0;j--) {
                matrix[rowNum][j] = matrix[rowNum][j-1];
            }
            matrix[rowNum][0] = temp;
        } else if(dirNum == 1) {
            int temp = matrix[rowNum][0];
            for(int j=0;j<m-1;j++) {
                matrix[rowNum][j] = matrix[rowNum][j+1];
            }
            matrix[rowNum][m-1] = temp;
        }
    }

    public static boolean findIdenticalNum(int row, int propagationDir) {
        boolean find = false;
        for(int j=0;j<m;j++) {
            if(matrix[row][j] == matrix[row + propagationDir][j]) {
                find = true;
                break;
            }
        }
        return find;
    }

    public static void main(String[] args) {
        
        //입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        matrix = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        Wind[] w = new Wind[q];
        for(int i=0;i<q;i++)
            w[i] = new Wind(sc.nextInt(), sc.next());

        
        // 바람
        for(int i=0; i<q; i++) {
            int dirNum = 0;
            if(w[i].dir=='R') dirNum = 1;
            int rowNum = w[i].row;
            push(rowNum, dirNum);
            // 위로 찾아보기
            for(int row=rowNum-1; row>=0; row--) {
                if(findIdenticalNum(row, +1) /*아랫줄이랑 비교하니까*/) {
                    dirNum = dirNum ^ 1;
                    push(row, dirNum);
                }
            }
            // 아래로 전파
            dirNum = 0;
            if(w[i].dir=='R') dirNum = 1;
            for(int row=rowNum+1; row<n; row++) {
                if(findIdenticalNum(row, -1) /*윗줄이랑 비교하니까*/) {
                    dirNum = dirNum ^ 1;
                    push(row, dirNum);
                }
            }
            
        }

        //출력
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    
    }
}