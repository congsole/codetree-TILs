import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        

        String[] s = new String[n];
        
        for(int i=0; i<n; i++) {
            String temp = sc.next();
            if(temp.startsWith(str)) {
                s[i] = temp;
            } else {
                s[i] = "가나다";
            }
        }
        
        Arrays.sort(s);
        System.out.print(s[k-1]);

    }
}