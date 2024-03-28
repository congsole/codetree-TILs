import java.util.*;

public class Main {

    public static int[] dn = new int[]{-1, -1, 1, 1};
    public static int[] dm = new int[]{1, -1, -1, 1};
    public static int MAX_DIR_NUM = 4;
    public static int N;
    public static int[][] matrix;

    public static boolean inRange(int x, int y) {
        return x>=0 && x<N && y>=0 && y<N;
    }
    
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        matrix = new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                matrix[i][j] = sc.nextInt();

        //
        // int maxSum = 0;
        // for(int i=1; i<=N-2; i++) {
        //     for(int j=1; j<=N-i; j++) {
        //         for(int n=0; n<N; n++) {
        //             loop1: for(int m=0; m<N; m++) {
        //                 int sum = 0;
        //                 int variableN = n;
        //                 int variableM = m;
        //                 // System.out.println(n + " " + m);
        //                 for(int k=1; k<=i; k++) {
        //                     variableN += dn[0];
        //                     variableM += dm[0];
        //                     // System.out.println(variableN + " " + variableM);
        //                     if(!inRange(variableN, variableM)) continue loop1;
        //                     sum += matrix[variableN][variableM];
        //                 }
        //                 for(int l=1; l<=j; l++) {
        //                     variableN += dn[1];
        //                     variableM += dm[1];
        //                     // System.out.println(variableN + " " + variableM);
        //                     if(!inRange(variableN, variableM)) continue loop1;
        //                     sum += matrix[variableN][variableM];
        //                 }
        //                 for(int k=1; k<=i; k++) {
        //                     variableN += dn[2];
        //                     variableM += dm[2];
        //                     // System.out.println(variableN + " " + variableM);
        //                     if(!inRange(variableN, variableM)) continue loop1;
        //                     sum += matrix[variableN][variableM];
        //                 }
        //                 for(int l=1; l<=j; l++) {
        //                     variableN += dn[3];
        //                     variableM += dm[3];
        //                     // System.out.println(variableN + " " + variableM);
        //                     if(!inRange(variableN, variableM)) continue loop1;
        //                     sum += matrix[variableN][variableM];
        //                 }
        //                 maxSum = Math.max(maxSum, sum);
        //                 // System.out.println("-------");
        //             }
        //         }
        //     }
        // }

        int maxSum = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                for(int k=1; k<N; k++) {
                    for(int l=1; l<N; l++) {
                        int sum = getSum(i, j, k, l);
                        maxSum = Math.max(sum, maxSum);
                    }
                }
            }
        }

        // 출력
        System.out.print(maxSum);    
    }

    public static int getSum(int i, int j, int k, int l) {
        int[] dirDistance = new int[]{k, l, k, l};
        int sum = 0;
        int n = i, m = j;

        for(int dirNum=0; dirNum<4; dirNum++) {
            int length = dirDistance[dirNum];
            while(length > 0) {
                n += dn[dirNum];
                m += dm[dirNum];
                if(!inRange(n, m)) return 0;
                sum += matrix[n][m];
                
                length--;
            }
        }
        return sum;
    }
}