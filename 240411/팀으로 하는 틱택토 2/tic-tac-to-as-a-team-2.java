import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0; i<3; i++) {
            String str = sc.next();
            a[i][0] = str.charAt(0) - '0';
            a[i][1] = str.charAt(1) - '0';
            a[i][2] = str.charAt(2) - '0';
        }

        int count = 0;
        for(int i=1; i<10; i++) {
            loop2: for(int j=i+1; j<10; j++) {
                for(int k=0; k<3; k++) {
                    if((i == a[k][0] && i == a[k][1] && j == a[k][2])
                        || (i == a[k][0] && j == a[k][1] && i == a[k][2])
                        || (j == a[k][0] && i == a[k][1] && i == a[k][2])
                        || (i == a[k][0] && j == a[k][1] && j == a[k][2])
                        || (j == a[k][0] && i == a[k][1] && j == a[k][2])
                        || (j == a[k][0] && j == a[k][1] && i == a[k][2])
                        ) {
                            count++;
                            break loop2;
                    }
                }
                for(int k=0; k<3; k++) {
                    if((i == a[0][k] && i == a[1][k] && j == a[2][k])
                        || (i == a[0][k] && j == a[1][k] && i == a[2][k])
                        || (j == a[0][k] && i == a[1][k] && i == a[2][k])
                        || (i == a[0][k] && j == a[1][k] && j == a[2][k])
                        || (j == a[0][k] && i == a[1][k] && j == a[2][k])
                        || (j == a[0][k] && j == a[1][k] && i == a[2][k])
                        ) {
                            count++;
                            break loop2;
                    }
                }
                if((i == a[0][0] && i == a[1][1] && j == a[2][2])
                        || (i == a[0][0] && j == a[1][1] && i == a[2][2])
                        || (j == a[0][0] && i == a[1][1] && i == a[2][2])
                        || (i == a[0][0] && j == a[1][1] && j == a[2][2])
                        || (j == a[0][0] && i == a[1][1] && j == a[2][2])
                        || (j == a[0][0] && j == a[1][1] && i == a[2][2])
                        ) {
                            count++;
                            break loop2;
                    }
                if((i == a[0][2] && i == a[1][1] && j == a[2][0])
                        || (i == a[0][2] && j == a[1][1] && i == a[2][0])
                        || (j == a[0][2] && i == a[1][1] && i == a[2][0])
                        || (i == a[0][2] && j == a[1][1] && j == a[2][0])
                        || (j == a[0][2] && i == a[1][1] && j == a[2][0])
                        || (j == a[0][2] && j == a[1][1] && i == a[2][0])
                        ) {
                            count++;
                            break loop2;
                    }
            }
        }
        System.out.print(count);       
    }
}