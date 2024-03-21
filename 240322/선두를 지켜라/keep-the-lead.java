import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        
        int[] aAt = new int[1000001];
        int[] bAt = new int[1000001];

        int aTime = 0;
        while(n-- > 0) {
            int v = sc.nextInt();
            int dt = sc.nextInt();
            for(int t = aTime + 1; t <= aTime + dt; t++) {
                aAt[t] = aAt[t-1] + v;
            }
            aTime = aTime + dt;
        }
        
        
        int bTime = 0;
        while(m-- > 0) {
            int v = sc.nextInt();
            int dt = sc.nextInt();
            for(int t = bTime + 1; t <= bTime + dt; t++) {
                bAt[t] = bAt[t-1] + v;
            }
            bTime = bTime + dt;
        }

        int count = 0;
        int leader = 0;
 
        for(int t=1; t<=aTime; t++) {
            if(aAt[t]<bAt[t]) {
                if(leader == 1)
                    count++;
                leader = 2;
            }
            if(aAt[t]>bAt[t]) {
                if(leader == 2)
                    count++;
                leader = 1;
            }
        }


        System.out.print(count);
    }
}