import java.util.*;

public class Main {
    public static int N;
    public static Map<Character, Integer> dr = new HashMap<>();
    public static Map<Character, Integer> dc = new HashMap<>();
    public static void main(String[] args) {
        dr.put('W', +0);
        dr.put('S', +1);
        dr.put('N', -1);
        dr.put('E', +0);
        
        dc.put('W', -1);
        dc.put('S', +0);
        dc.put('N', +0);
        dc.put('E', +1);
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        int t = 0;
        int r = 0, c = 0;
        for(int n=0; n<N; n++) {
            char dir = sc.next().charAt(0);
            int distance = sc.nextInt();
            for(int d=1; d<=distance; d++) {
                r += dr.get(dir);
                c += dc.get(dir);
                t++;
                if(r == 0 && c == 0) {
                    System.out.print(t);
                    return;
                }
            }
        }

    }
}