import java.util.*;

public class Main {
    public static int K, N;
    public static List<Map<Integer, Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt(); // 경기의 수
        N = sc.nextInt(); // 개발자 수

        for(int i=0; i<K; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int j=1; j<=N; j++) {
                map.put(sc.nextInt(), j);
            }
            list.add(map);
        }

        int count = 0;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(i == j) continue;
                boolean higher = true;
                for(int k=0; k<K; k++) {
                    Map<Integer, Integer> map = list.get(k);
                    if(map.get(i) >= map.get(j)) {
                        higher = false;
                    }
                }
                if(higher) count++;
            }
        }
        System.out.print(count);

    }
}