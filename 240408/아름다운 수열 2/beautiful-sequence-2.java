import java.util.*;

public class Main {
    public static int N, M;
    public static int[] A, B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = sc.nextInt();
        B = new int[M];
        for(int i=0; i<M; i++)
            B[i] = sc.nextInt();

        Arrays.sort(B);

        int count = 0;
        for(int i=0; i<=N-M; i++) {
            int[] temp = new int[M];
            int k=0;
            for(int j=i; j<i+M; j++) {
                temp[k] = A[j];
                k++;
            }
            Arrays.sort(temp);
            if(Arrays.equals(temp, B)) {
                count++;
            }
        }
        System.out.print(count);
    }
}