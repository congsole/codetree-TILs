import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Queue<Integer> qu = new LinkedList<>();
        
        for(int i=1;i<=n;i++) {
            qu.add(i);
        }

        while(qu.size() > 0) {
            for(int i=1;i<k;i++) {
                qu.add(qu.poll());
            }
            System.out.print(qu.poll() + " ");
        }
    }
}