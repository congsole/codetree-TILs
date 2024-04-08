import java.util.*;

public class Main {
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt(), c2 = sc.nextInt();

        int count = 0;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                for(int k=1; k<=N; k++) {
                    if((Math.abs(a1-i)<=2 || Math.abs(a1-i) >= N-2) && (Math.abs(b1-j)<=2 || Math.abs(b1-j) >= N-2) && (Math.abs(c1-k)<=2 || Math.abs(c1-k) >= N-2)) count++;
                    else if((Math.abs(a2-i)<=2 || Math.abs(a2-i) >= N-2) && (Math.abs(b2-j)<=2 || Math.abs(b2-j) >= N-2) && (Math.abs(c2-k)<=2 || Math.abs(c2-k) >= N-2)) count++;
                }
            }
        }
        System.out.print(count);


    }
}