import java.util.*;

public class Main {
    public static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        int minT = 1000;
        for(int vMax=1; vMax<=x; vMax++) {
            for(int tU=1; tU<=x; tU++) {
                int t=0;
                int v=1;
                int distance=0;
                int vMaxT = vMax-v;
                while(true) {
                    if(t < vMaxT) {
                        distance += v;
                        t++;
                        v++;
                    } else if(t >= vMaxT && t < vMaxT + tU) {
                        distance += vMax*tU;
                        t += tU;
                        if(v>1) v--;
                    } else {
                        distance += v;
                        t++;
                        if(v>1) v--;
                    }
                    if(distance >= x) {
                        break;
                    }
                }
                // System.out.println(vMax + " " + tU + " " + t + " " + distance + " " + v);
                if(distance == x && v == 1) {
                    minT = Math.min(minT, t);
                }
            }   
        }
        System.out.print(minT);
    }
}