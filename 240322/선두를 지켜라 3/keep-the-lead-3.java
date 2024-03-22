import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] aAt = new int[1000000];
        int[] bAt = new int[1000000];

        int aTime = 0;
        while(n-- > 0) {
            int v = sc.nextInt();
            int dt = sc.nextInt();
            for(int t = aTime+1; t <= aTime + dt; t++) {
                aAt[t] = aAt[t-1] + v;
            }
            aTime += dt;
        }

        int bTime = 0;
        while(m-- > 0) {
            int v = sc.nextInt();
            int dt = sc.nextInt();
            for(int t = bTime+1; t <= bTime + dt; t++) {
                bAt[t] = bAt[t-1] + v;
            }
            bTime += dt;
        }

        char leader = 'T';
        int count = 0;
        for(int t = 0; t <= aTime; t++) {
            if(aAt[t] > bAt[t]) {
                if(leader != 'A') count++;
                leader = 'A';
            } else if(aAt[t] == bAt[t]) {
                if(leader != 'T') count++;
                leader = 'T';
            } else {
                if(leader != 'B') count++;
                leader = 'B';
            }
        }
        System.out.print(count);
    }
}