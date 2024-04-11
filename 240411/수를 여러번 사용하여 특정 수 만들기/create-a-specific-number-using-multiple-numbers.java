import java.util.*;

public class Main {
    public static int A, B, C;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        int maxSum = 0;
        for(int i=0; i<C; i++) {
            for(int j=0; j<C; j++) {
                int sum = A*i + B*j;
                if(sum <= C) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        System.out.print(maxSum);
    }
}