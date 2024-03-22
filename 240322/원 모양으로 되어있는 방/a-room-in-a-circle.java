import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] criteria = new int[n];

        int people = 0;
        for(int i=0; i<n; i++) {
            criteria[i] = sc.nextInt();
        }

        int minCount = 100300;
        for(int i=0; i<n; i++) {
            int count = 0;
            // 이동시키면서 거리 카운팅
            for(int j=0; j<n; j++) {
                if(i < j) {
                    count += criteria[j] * (j-i);
                } else if(i > j) {
                    count += criteria[j] * (j-i+n);
                }
            }

            // minCount 갱신하기
            minCount = Math.min(minCount, count);
        }
        System.out.print(minCount);
    }
}