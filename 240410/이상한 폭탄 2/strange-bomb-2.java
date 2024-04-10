import java.util.*;

public class Main {
    public static int N, K;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 폭탄의 수
        K = sc.nextInt(); // 특정 거리
        a = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        
        int maxNum = -1;
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(a[i] == a[j] && j-i <= K) {
                    maxNum = Math.max(a[i], maxNum);
                }
            }
        }
        System.out.print(maxNum);
    }
}