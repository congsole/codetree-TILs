import java.util.*;

public class Main {
    public static char[] a;
    public static int n;

    public static int getMinDistance() {
        int minDistance = 100;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] == '1' && a[j] == '1') {
                    int distance = j-i;
                    minDistance = Math.min(distance, minDistance);
                }
            }
        }
        return minDistance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String str = sc.next();
        a = str.toCharArray();

        int maxOfmin = 0;
        
        for(int i=0; i<n; i++) {
            if(a[i] == '1') continue;
            for(int j=i+1; j<n; j++) {
                if(a[j] == '1') continue;
                a[i] = '1';
                a[j] = '1';
                int min = getMinDistance();
                maxOfmin = Math.max(min, maxOfmin);
                a[i] = '0';
                a[j] = '0';
            }
        }
        System.out.print(maxOfmin);
    }
}