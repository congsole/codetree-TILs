import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] a = str.toCharArray();

        int maxMinD = 0;
        for(int i=0; i<n; i++) {
            if(a[i] == '1') continue;
            int minD = 20;
            a[i] = '1';

            for(int j=0; j<n; j++) {
                int d = 0;
                for(int k=j+1; k<n; k++) {
                    if(a[j] == '1' && a[k] == '1') {
                        d = k-j;
                        minD = Math.min(minD, d);
                    }
                }
            }


            a[i] = '0';
            maxMinD = Math.max(maxMinD, minD);
        }

        System.out.print(maxMinD);
    }
}