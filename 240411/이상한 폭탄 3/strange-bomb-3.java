import java.util.*;

public class Main {
    public static int N, K;
    public static int[] bomb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        bomb = new int[N];
        for(int i=0; i<N; i++) {
            bomb[i] = sc.nextInt();
        }

        int maxCount = 0;
        int num = 0;
        for(int i=0; i<N; i++) {
            int count = 1;
            for(int j=i+1; j<=i+K; j++) {
                if(j < N && bomb[i] == bomb[j]) count++;
            }
            maxCount = Math.max(maxCount, count);
            if(maxCount == count) num = bomb[i];
        }
        System.out.print(num);

    }
}