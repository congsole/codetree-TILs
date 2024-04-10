import java.util.*;

class Dev {
    int start, end;
    public Dev(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class Main {
    public static int N;
    public static List<Dev> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0; i<N; i++) {
            list.add(new Dev(sc.nextInt(), sc.nextInt()));
        }

        int maxTotalTimes = 0;
        for(int i=0; i<N; i++) {
            int[] times = new int[1001];
            int totalTimes = 0;
            for(int j=0; j<N; j++) {
                if(i == j) continue;
                Dev dev = list.get(j);
                for(int t=dev.start; t<dev.end; t++) {
                    times[t] = 1;
                }
            }
            for(int j=0; j<1001; j++) {
                totalTimes += times[j];
            }
            maxTotalTimes = Math.max(maxTotalTimes, totalTimes);
        }

        System.out.print(maxTotalTimes);
    }
}