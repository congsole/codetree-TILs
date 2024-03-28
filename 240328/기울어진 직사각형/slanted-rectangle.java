import java.util.*;

public class Main {

    public static int[] dn = new int[]{-1, -1, 1, 1};
    public static int[] dm = new int[]{1, -1, -1, 1};
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
        int maxSum = 0;
        for(int i=1; i<=N-2; i++) {
            for(int j=1; j<=N-i; j++) {
                for(int n=0; n<N; n++) {
                    loop1: for(int m=0; m<N; m++) {
                        int sum = 0;
                        int variableN = n;
                        int variableM = m;
                        // System.out.println(n + " " + m);
                        for(int k=1; k<=i; k++) {
                            variableN += dn[0];
                            variableM += dm[0];
                            // System.out.println(variableN + " " + variableM);
                            if(!inRange(variableN, variableM)) continue loop1;
                            sum += matrix[variableN][variableM];
                        }
                        for(int l=1; l<=j; l++) {
                            variableN += dn[1];
                            variableM += dm[1];
                            // System.out.println(variableN + " " + variableM);
                            if(!inRange(variableN, variableM)) continue loop1;
                            sum += matrix[variableN][variableM];
                        }
                        for(int k=1; k<=i; k++) {
                            variableN += dn[2];
                            variableM += dm[2];
                            // System.out.println(variableN + " " + variableM);
                            if(!inRange(variableN, variableM)) continue loop1;
                            sum += matrix[variableN][variableM];
                        }
                        for(int l=1; l<=j; l++) {
                            variableN += dn[3];
                            variableM += dm[3];
                            // System.out.println(variableN + " " + variableM);
                            if(!inRange(variableN, variableM)) continue loop1;
                            sum += matrix[variableN][variableM];
                        }
                        maxSum = Math.max(maxSum, sum);
                        // System.out.println("-------");
                    }
                }
            }
        }


        // 출력
        System.out.print(maxSum);    
    }
}