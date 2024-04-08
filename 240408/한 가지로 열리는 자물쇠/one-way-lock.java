import java.util.*;

public class Main {
    public static int N, a, b, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        int count = 0;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                for(int k=1; k<=N; k++) {
                    if(Math.abs(i-a)<=2 || Math.abs(j-b)<=2 || Math.abs(k-c)<=2) {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}