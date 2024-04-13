import java.util.*;

public class Main {
    public static int N;
    public static List<Integer> a = new ArrayList<>(); 
    public static List<Integer> b = new ArrayList<>(); 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0; i<N; i++) {
            int c = sc.nextInt();
            if(c % 2 == 0) a.add(c);
            else b.add(c);
        }

        if(Math.abs(a.size() - b.size()) < 2) {
            System.out.print(N);
            return;
        }
        int aSize = a.size();
        int bSize = b.size();
        int turn = 0;
        while(aSize + bSize > 0) {
            if(turn % 2 == 0) {
                if(aSize > 0) {
                    aSize--;
                } else {
                    bSize -= 2;
                }
                if(bSize == -1) {
                    System.out.print(turn -1);
                    return;
                }
            } else {
                bSize--;
            }
            turn++;
        }
        System.out.print(turn);
    }   
}