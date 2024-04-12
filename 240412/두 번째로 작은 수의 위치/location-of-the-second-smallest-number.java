import java.util.*;

public class Main {
    public static int n;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int firstCount = 0, secondCount = 0;

        for(int i=0; i<n; i++) {
            if(a[i] == a[0]) firstCount++;
        }
        if(firstCount == n) {
            System.out.print(-1);
            return;
        } 
        for(int i=0; i<n; i++) {
            if(a[firstCount] == a[i]) secondCount++;
        }
        if(secondCount > 1) {
            System.out.print(-1);
            return;
        }
        System.out.print(firstCount+1);

    }
}