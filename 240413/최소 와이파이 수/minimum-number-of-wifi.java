import java.util.*;

public class Main {
    public static int n, m;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int section = 0;
        int range = m * 2 + 1;

        int i=0;
        int r=0;;
        while(i<n) {
            if(r == 0 && a[i] == 1) {
                section++;
                r++;
                while(r<range) {
                    r++;
                    i++;
                }
            }
            if(r == range) {
                r = 0;
            }
            
            i++;
        }

        System.out.print(section);

    }
}