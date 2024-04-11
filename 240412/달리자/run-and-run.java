import java.util.*;

public class Main {
    public static int n;
    public static int[] A, B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n+1];
        B = new int[n+1];

        for(int i=1; i<=n; i++) {
            A[i] = sc.nextInt();
        }
        for(int i=1; i<=n; i++) {
            B[i] = sc.nextInt();
        }

        int distance = 0;
        for(int i=1; i<n; i++) {
            if(A[i] > B[i]) {
                distance += (A[i]-B[i]);
                A[i+1] += (A[i]-B[i]);
            }
        }
        System.out.print(distance);
        
    }
}