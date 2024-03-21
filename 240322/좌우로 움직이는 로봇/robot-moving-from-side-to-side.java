import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int[] aAt = new int[1000000];
        int[] bAt = new int[1000000];

        int aTime = 0;
        while(n-- > 0) {
            int dt = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R') {
                for(int t = aTime+1; t <= aTime + dt; t++) {
                    aAt[t] = aAt[t-1] + 1;

                }
            } else {
                for(int t = aTime+1; t <= aTime + dt; t++) {
                    aAt[t] = aAt[t-1] - 1;

                }
            }
            aTime += dt;
        }

        
        int bTime = 0;
        while(m-- > 0) {
            int dt = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R') {
                for(int t = bTime+1; t <= bTime + dt; t++) {
                    bAt[t] = bAt[t-1] + 1;

                }
            } else {
                for(int t = bTime+1; t <= bTime + dt; t++) {
                    bAt[t] = bAt[t-1] - 1;

                }
            }
            bTime += dt;
        }

        int totalTime = aTime>bTime? aTime : bTime;
        
        if(totalTime > aTime) {
            for(int t=aTime+1; t<=totalTime; t++) {
                aAt[t] = aAt[t-1];

            }
        } else if(totalTime > bTime) {
            for(int t=bTime+1; t<=totalTime; t++) {
                bAt[t] = bAt[t-1];
            }
        }
        
        int count = 0;
        for(int t = 1; t<=totalTime; t++) {
            if(aAt[t] == bAt[t] && aAt[t-1] != bAt[t-1]) {
                count++;
            }
        }

        System.out.print(count);
    }
}