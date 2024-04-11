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
        int num = 0;
        int maxCount = 0;
        for(int i=0; i<N; i++) {
            int keepNum = bomb[i];
            int bombCount = 1;
            for(int j=0; j<N; j++) {
                if(keepNum != bomb[j]) continue;
                for(int k=j+1; k<N; k++) {
                    if(keepNum != bomb[k]) continue;
                    if(k-j <= K) bombCount++;    
                }
            }
            if (bombCount == 1) bombCount = -1;
            maxCount = Math.max(maxCount, bombCount);
            if(maxCount == bombCount) num = Math.max(keepNum, num);
        }   

        System.out.print(num);

        
    
    }
}