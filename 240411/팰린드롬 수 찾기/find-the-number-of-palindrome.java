import java.util.*;

public class Main {
    public static int X, Y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();

        int count = 0;
        for(int n=X; n<=Y; n++) {
            String str = n + "";
            char[] c = str.toCharArray();
            int middle = c.length/2;
            boolean ok = true;
            for(int i=0; i<=middle; i++) {
                if(c[i] == c[c.length-1-i]) {}
                else {
                    ok = false;
                    break;
                }
            }
            if(ok) count++;
        }


        System.out.print(count);
    }
}