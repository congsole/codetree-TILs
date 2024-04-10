import java.util.*;

class Machine {
    int lowT, highT;
    public Machine(int lt, int ht) {
        this.lowT = lt;
        this.highT = ht;
    }

}

public class Main {
    public static int N, C, G, H;
    public static List<Machine> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 기계 갯수
        C = sc.nextInt(); // 미만 시 작업량
        G = sc.nextInt(); // 선호온도 내 작업량
        H = sc.nextInt(); // 초과 시 작업량

        for(int i=0; i<N; i++)
            list.add(new Machine(sc.nextInt(), sc.nextInt()));

        int lowestT = 0, highestT = 0;
        Collections.sort(list, (a, b) -> a.lowT - b.lowT);
        lowestT = list.get(0).lowT-10;
        Collections.sort(list, (a, b) -> b.highT - a.highT);
        highestT = list.get(0).highT+10;

        int maxSum = 0;

        for(int T=lowestT; T<=highestT; T++) {
            int sum = 0;
            for(int i=0; i<N; i++) {
                int work = 0;
                Machine m = list.get(i);
                if(T < m.lowT) {
                    work = C;
                } else if(T > m.highT) {
                    work = H;
                } else {
                    work = G;
                }
                sum += work;
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);
        
    }
}