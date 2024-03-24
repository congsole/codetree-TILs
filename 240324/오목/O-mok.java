import java.util.*;

public class Main {

    public static int MATRIX_SIZE = 19;

    public static boolean inRange(int n, int m) {
        return n>=0 && n<=MATRIX_SIZE && m>=0 && m<=MATRIX_SIZE;
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] plane = new int[MATRIX_SIZE+1][MATRIX_SIZE+1];
        for(int i=1; i<MATRIX_SIZE+1; i++) {
            for(int j=1; j<MATRIX_SIZE+1; j++) {
                plane[i][j] = sc.nextInt();
            }
        }
        int[] dn = new int[] {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dm = new int[] {1, 1, 0, -1, -1, -1, 0, 1};


        for(int i=1; i<=MATRIX_SIZE; i++) {
            for(int j=1; j<=MATRIX_SIZE; j++) {
                if(plane[i][j] == 1 || plane[i][j] == 2) {
                    int dirNum = 0;
                    while(dirNum++ <7) {
                        int count = 1;
                        int middleN=0, middleM=0;       
                        while(true) {
                            if(inRange(i+count*dn[dirNum], j+count*dm[dirNum]) && plane[i+count*dn[dirNum]][j+count*dm[dirNum]] == plane[i][j]) {
                                count++;
                                if(count == 2) {
                                    middleN = i + 2*dn[dirNum];
                                    middleM = j + 2*dm[dirNum];
                                }
                            } else {
                                break;
                            }
                            if(count == 5) {
                                System.out.println(plane[i][j]);
                                System.out.printf("%d %d", middleN, middleM);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.print(0);














        /*
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
        */
    }
}