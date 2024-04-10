import java.util.*;

public class Main {
    public static int T, a, b;
    public static List<Integer> s = new ArrayList<>();
    public static List<Integer> n = new ArrayList<>();
    
    public static int getShortest(List<Integer> list, int x) {
        int minDistance = 1000;
        for(Integer i:list) {
            int distance = Math.abs(i-x);
            minDistance = Math.min(minDistance, distance);
        }
        return minDistance;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        
        for(int i=0; i<T; i++) {
            char c = sc.next().charAt(0);
            if(c == 'S') s.add(sc.nextInt());
            if(c == 'N') n.add(sc.nextInt());
        }

        Collections.sort(s);
        Collections.sort(n);


        int count = 0;
        for(int k=a; k<=b; k++) {
            int d1 = getShortest(s, k);
            int d2 = getShortest(n, k);
            if(d1 <= d2) count++;
        }

        System.out.print(count);
    }
}