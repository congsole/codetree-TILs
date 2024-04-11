import java.util.*;

public class Main {
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        String str = sc.next();
        String[] a = new String[N];
        for(int i=0; i<N; i++) {
            a[i] = Character.toString(str.charAt(i));
        }

        loop1: for(int i=1; i<=N; i++) {
            for(int j=0; j<N-i+1; j++) {
                String s = "";
                for(int k=j; k<j+i; k++) {
                    s += a[k];
                }
                for(int l=j+1; l<N-i+1; l++) {
                    String s2 = "";
                    for(int k=l; k<l+i; k++) {
                        s2 += a[k];
                        if(s.equals(s2)) continue loop1;
                    }
                }
                
            }
            System.out.print(i);
                return;
        }
    }
}