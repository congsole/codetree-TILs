import java.util.*;

public class Main {
    public static int n;
    public static char[] c;
    public static int[] s, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = new char[n];
        s = new int[n];
        m = new int[n];
        int aScore = 0;
        int bScore = 0;
        for(int i=0; i<n; i++) {
            c[i] = sc.next().charAt(0);
            s[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(c[i] == 'A') aScore += s[i];
            else bScore += s[i];

            if(aScore>bScore) {
                m[i] = 1;
            } else if(aScore<bScore) {
                m[i] = 2;
            } else {
                m[i] = 0;
            }
        }

        int count = 1;
        for(int i=1; i<n; i++) {
            if(m[i] != m[i-1]) count++;
        }

        System.out.print(count);
        
    }
}