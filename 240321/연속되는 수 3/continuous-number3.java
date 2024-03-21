import java.util.*;

public class Main {

    public static int buho(int a) {
        return a/Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        int count = 1;
        int maxCount = 1;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if(i>0 && buho(a[i]) == buho(a[i-1])) {
                count++;
            }
            else {
                count = 1;
            }
            maxCount = Math.max(count, maxCount);
        } 
        System.out.print(maxCount);


    }
}