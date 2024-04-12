import java.util.*;

public class Main {
    public static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        int minT = x;
        for(int tSet=1; tSet<=x; tSet++) {
            int v = 1;
            int t = 0;
            int distance = 0;
            while(distance < x) {
                distance += v;
                t++;
                if(t < tSet) {
                    v++;
                } else {
                    if(v>1) v--;
                }
        
            // System.out.println(distance + " " + t + " " + v);
            }
            if(distance == x && v == 1) {
                minT = Math.min(minT, t);
            }
        }
            System.out.print(minT);
    }
}