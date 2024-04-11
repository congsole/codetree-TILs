import java.util.*;

public class Main {
    public static int N;
    public static int[] A;
    public static int[] B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        B = new int[N-1];

        for(int i=0; i<N-1; i++)
            B[i] = sc.nextInt();

        loop1: for(int i=1; i<=N; i++) {
            boolean isOk = true;
            A = new int[N];
            A[0] = i;
            int index=1;
            while(index < N) {
                A[index] = B[index-1] - A[index-1];
                index++;
            }
            /**/
            // for(int j=0; j<N; j++) {
            //     System.out.print(A[j] + " ");
            // }
            // System.out.println();
            /**/
            int[] C = new int[N];
            for(int j=0; j<N; j++) {
                C[j] = A[j];
            }
            Arrays.sort(C);
            if(C[N-1] > N || C[0] < 1) {
                isOk = false;
                continue;
            }
            for(int j=1; j<N; j++) {
                if(C[j] == C[j-1]) {
                    isOk = false;
                    continue loop1;
                }
            }
            if(isOk) {
                for(int j=0; j<N; j++) {
                    System.out.print(A[j] + " ");
                }
                return;
            }
        }

    }   
}