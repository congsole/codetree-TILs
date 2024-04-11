import java.util.*;

public class Main {
    public static int N;
    public static Map<Integer, List<Integer>> observe = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 비둘기를 관찰한 횟수
        for(int i=1; i<=10; i++) {
            observe.put(i, new ArrayList<>());
        }
        for(int i=0; i<N; i++) {
            observe.get(sc.nextInt()).add(sc.nextInt());
        }

        int count = 0;
        for(int i=1; i<=10; i++) {
            if(observe.get(i).size() == 0) continue;
            List<Integer> list = observe.get(i);
            for(int j=1; j<list.size(); j++) {
                if(list.get(j) != list.get(j-1)) count++; 
            }
        }

        System.out.print(count);
    }
}