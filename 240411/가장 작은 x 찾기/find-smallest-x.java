import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int maxX = b[0]/2;

        loop1: for(int x=1; x<=maxX; x++) {
            int tempX = x;
            for(int i=0; i<n; i++) {
                tempX = tempX * 2;
                if(tempX < a[i] || tempX > b[i]) {
                    continue loop1;
                }
            }
            System.out.print(x);
            return;
        }

    }
}