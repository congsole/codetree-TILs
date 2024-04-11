import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 원소의 개수
        int K = sc.nextInt(); // 최댓값과 최솟값 간 차이의 상한값

        int[] a = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        int maxCount = 0;
        loop1: for(int i=0; i<N; i++) {
            int count = 0;
            for(int j=i+1; j<N; j++) {
                if(a[j] - a[i] > K) continue loop1;
                else {
                    count = j-i+1;
                    maxCount = Math.max(maxCount, count);
                }
            }
        }
        System.out.print(maxCount);
    }
}