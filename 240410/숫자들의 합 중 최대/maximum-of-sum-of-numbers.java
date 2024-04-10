import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        int sum = 0;
        int maxSum = 0;
        for(int i=x; i<=y; i++) {
            d1 = i / 10000;
            d2 = (i/1000) % 10;
            d3 = (i/100) % 10;
            d4 = (i/10) % 10;
            d5 = (i/1) % 10;
            sum = d1 + d2 + d3 + d4 + d5;
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);
    }
}