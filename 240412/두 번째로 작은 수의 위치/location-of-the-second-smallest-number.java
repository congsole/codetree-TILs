import java.util.*;

public class Main {
    public static int n;
    public static int[] a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        Arrays.sort(b);
        int firstCount = 0, secondCount = 0;

        for(int i=0; i<n; i++) {
            if(b[i] == b[0]) firstCount++;
        }
        if(firstCount == n) {
            System.out.print(-1);
            return;
        } 
        for(int i=0; i<n; i++) {
            if(b[firstCount] == b[i]) secondCount++;
        }
        if(secondCount > 1) {
            System.out.print(-1);
            return;
        }
        
        for(int i=0; i<n; i++) {
            if(a[i] == b[firstCount]) {
                System.out.print(i+1);
            }
        }

    }
}