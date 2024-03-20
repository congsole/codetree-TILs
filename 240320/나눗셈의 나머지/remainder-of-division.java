import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] count = new int[b];

        for(int c: count) {
            c = 0;
        }

        while(true) {
            int n = a % b;
            count[n]++;
            a /= b;
            if(a == 0) break;
        }
        int sum = 0;
        for(int c: count) {
            sum += c*c;
        }

        System.out.print(sum);
    }
}