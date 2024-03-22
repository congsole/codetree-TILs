import java.util.*;

public class Main {
    public static int N;

    public static boolean inRange(int n, int m) {
        return n>=0 && n<N && m>=0 && m<N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[][] matrix = new int[N][N];
        int[] dn = new int[] {0, -1, 0, 1};
        int[] dm = new int[] {1, 0, -1, 0};

        int dirNum = 0;
        int n = N/2; int m = N/2;

        int moveNum = 1;
        int cnt = 1;
        while(inRange(n, m)) {

            for(int i = 0; i < moveNum; i++) {
                matrix[n][m] = cnt;
                cnt++;

                n += dn[dirNum];
                m += dm[dirNum];
            }
            
            dirNum = (dirNum + 1) % 4;
            if(dirNum == 0 || dirNum ==2) {
                moveNum++;
            }

        }
        



        // 격자 출력하기    
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    
    }

}