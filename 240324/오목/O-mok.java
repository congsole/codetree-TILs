import java.util.*;

public class Main {

    public static int MATRIX_SIZE = 19;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] plane = new int[MATRIX_SIZE+1][MATRIX_SIZE+1];
        for(int i=1; i<MATRIX_SIZE+1; i++) {
            for(int j=1; j<MATRIX_SIZE+1; j++) {
                plane[i][j] = sc.nextInt();
            }
        }
        
        int winner = 0;
        int k = 1;
        // k가 이겼는지 찾아보기
        while(k <= 2) {
            // (1) 가로
            for(int i=0; i<MATRIX_SIZE+1; i++) {
                for(int j=0; j<MATRIX_SIZE+1-4; j++) {
                    if(plane[i][j] == k && plane[i][j+1] == k && plane[i][j+2] == k && plane[i][j+3] == k && plane[i][j+4] == k) {
                        winner = k;
                        System.out.println(winner);
                        System.out.print(i + " " + (j+2));
                        return;
                    }
                }
            }
            // (2) 세로
            for(int j=0; j<MATRIX_SIZE+1; j++) {
                for(int i=0; i<MATRIX_SIZE+1-4; i++) {
                    if(plane[i][j] == k && plane[i+1][j] == k && plane[i+2][j] == k && plane[i+3][j] == k && plane[i+4][j] == k) {
                        winner = k;
                        System.out.println(winner);
                        System.out.print((i+2) + " " + j);
                        return;
                    }
                }
            }
            // (3) 우하향
            for(int i=0; i<MATRIX_SIZE+1-4; i++) {
                for(int j=0; j<MATRIX_SIZE+1-4; j++) {
                    if(plane[i][j] == k && plane[i+1][j+1] == k && plane[i+2][j+2] == k && plane[i+3][j+3] == k && plane[i+4][j+4] == k) {
                        winner = k;
                        System.out.println(winner);
                        System.out.print((i+2) + " " + (j+2));
                        return;
                    }
                }
            }
            // (4) 우상향
            for(int i=4; i<MATRIX_SIZE+1; i++) {
                for(int j=0; j<MATRIX_SIZE+1-4; j++) {
                    if(plane[i][j] == k && plane[i-1][j+1] == k && plane[i-2][j+2] == k && plane[i-3][j+3] == k && plane[i-4][j+4] == k) {
                        winner = k;
                        System.out.println(winner);
                        System.out.print((i-2) + " " + (j+2));
                        return;
                    }
                }
            }
            k++;

        }
        System.out.print(0);
        
    }
}