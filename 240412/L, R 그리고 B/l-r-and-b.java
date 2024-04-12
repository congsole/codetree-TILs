import java.util.*;

public class Main {
    public static final int N = 10;
    public static char[][] matrix = new char[N][N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int br = 0, bc = 0, rr = 0, rc = 0, lr = 0, lc = 0;
        for(int i=0; i<N; i++) {
            String str = sc.next();
            for(int j=0; j<N; j++) {
                matrix[i][j] = str.charAt(j);
                if(matrix[i][j] == 'B') {
                    br = i;
                    bc = j;
                } else if(matrix[i][j] == 'R') {
                    rr = i;
                    rc = j;
                } else if(matrix[i][j] == 'L') {
                    lr = i;
                    lc = j;
                }
            }
        }

        int distance = 0;
        if(br == rr && rr == lr) {
            if((bc < rc && rc < lc) || (bc > rc && rc > lc)) {
                distance = Math.abs(bc - lc) + 1;
            } else {
                distance = Math.abs(bc - lc) - 1;
            }
        } else if(bc == rc && rc == lc) {
            if((br < rr && rr < lr) || (br > rr && rr > lr)) {
                distance = Math.abs(br - lr) + 1;
            } else {
                distance = Math.abs(br - lr) - 1;
            }
        } else {
            distance = Math.abs(br - lr) + Math.abs(bc - lc) - 1;
        }


        System.out.print(distance);

    }
}