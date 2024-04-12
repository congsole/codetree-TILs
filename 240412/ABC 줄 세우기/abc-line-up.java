import java.util.*;

public class Main {
    public static char[] a;
    public static char[] b;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new char[n];
        b = new char[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.next().charAt(0);
            b[i] = a[i];
        }
        Arrays.sort(b);

        int count = 0;
        while(true) {
            for(int i=1; i<n; i++) {
                if(a[i] < a[i-1]) {
                    char temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    count++;
                }
            }
            if(Arrays.equals(a, b)) {
                System.out.print(count);
                return;
            }
        }


        
    }

}