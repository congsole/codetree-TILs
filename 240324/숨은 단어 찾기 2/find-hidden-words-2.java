import java.util.*;

public class Main {
    
    public static int[] dn = new int[] {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dm = new int[] {1, 1, 0, -1, -1, -1, 0, 1};
    public static char[][] matrix;
    public static int N, M;
    public static boolean inRange(int n, int m) {
        return n>=0 && n<N && m>=0 && m<M;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        matrix = new char[N][M];

        for(int i=0; i<N; i++) {
            String str = sc.next();
            for(int j=0; j<M; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }
        int count = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(matrix[i][j] != 'L') continue;
                int dirNum = 0;
                while(dirNum <8) {
                    int n1 = i + dn[dirNum];
                    int n2 = i + 2* dn[dirNum];
                    int m1 = j + dm[dirNum];
                    int m2 = j + 2 * dm[dirNum];
                    if(inRange(n1, m1) && inRange(n2, m2) && matrix[n1][m1] == 'E' && matrix[n2][m2] == 'E') count++;
                    dirNum++;
                }
            }
        }
        System.out.print(count);
    }
}