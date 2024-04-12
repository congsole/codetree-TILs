import java.util.*;

public class Main {
    public static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        int distance = 0;
        int t = 0;
        int v = 1;

        while(t<=x) {
            distance += v;
            t++;
            if(x-distance >= (v+2)*(v+1)/2) {
                v++;
            } else if(x-distance >= v*(v+1)/2) {
                v = v;
            } else {
                if(v>1)v--;
            }
            // System.out.println(t + " " + v + " " + distance);
            if(distance == x && v == 1) {
                System.out.print(t);
                return;
            }
        }

    }
}