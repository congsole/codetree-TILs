import java.util.*;

public class Main {
    public static int N;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int average = sum / N;
        int count = 0;
        for(int i=0; i<N; i++) {
            count += Math.abs(a[i] - average);
        }
        System.out.print(count/2);
    }
}