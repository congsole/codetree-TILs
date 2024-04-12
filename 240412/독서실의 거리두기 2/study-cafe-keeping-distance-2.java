import java.util.*;

public class Main {
    public static int n;
    public static char[] a;
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String str = sc.next();
        a = str.toCharArray();

        loop1: for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] == '1' && a[j] == '1') {
                    list.add(j-i);
                    continue loop1;
                }
            }
        }
        
        int startD = 0;
        if(a[0] == '0') {
            for(int i=1; i<n;i++) {
                if(a[i] == '1') {
                    startD = i - 0;
                    break;
                }
            }
        }
        int endD = 0;
        if(a[n-1] == '0') {
            for(int i=n-2; i>=0;i--) {
                if(a[i] == '1') {
                    endD = n-1 - i;
                    break;
                }
            }
        }

        Collections.sort(list, (a,b) -> b - a);
        System.out.print(Math.min(Math.max(Math.max(list.get(0)/2, endD), startD), list.get(list.size()-1)));
    }
}