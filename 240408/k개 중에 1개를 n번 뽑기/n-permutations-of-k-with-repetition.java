import java.util.*;

public class Main {
    public static int K, N;
    public static List<Integer> list = new ArrayList<>();
    public static void print() {
        for(Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void choose(int n) {
        if(n == N+1) {
            print();
            return;
        }

        for(int i=1; i<=K; i++) {
            list.add(i);
            choose(n+1);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();

        choose(1);
    }
}