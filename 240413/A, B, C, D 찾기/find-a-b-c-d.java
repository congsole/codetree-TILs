import java.util.*;

public class Main {
    public static final int N = 15;
    public static int a, b, c, d, abcd, bcd;
    public static int[] arr = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<N; i++) 
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        abcd = arr[14];
        d = abcd - a - b - c;

        System.out.print(a + " " + b + " " + c + " " + d);

    }
}