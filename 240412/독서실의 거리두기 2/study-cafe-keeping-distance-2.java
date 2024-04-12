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

        int maxOfMinD = 0;
        if(a[0] == '0') {
            a[0] = '1';
            int minD = n;
            loop1: for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(a[i] == '1' && a[j] == '1') {
                        minD = Math.min(minD, j-i);
                        continue loop1;
                    }
                }
            }
            a[0] = '0';
            maxOfMinD = Math.max(maxOfMinD, minD);
        }
        if(a[n-1] == '0') {
            a[n-1] = '1';
            int minD = n;
            loop1: for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(a[i] == '1' && a[j] == '1') {
                        minD = Math.min(minD, j-i);
                        continue loop1;
                    }
                }
            }
            a[n-1] = '0';
            maxOfMinD = Math.max(maxOfMinD, minD);
        }

        loop1: for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] == '1' && a[j] == '1') {
                    list.add(j-i);
                    continue loop1;
                }
            }
        }
        if(list.size() > 0) {
            Collections.sort(list);
            int minD = Math.min(list.get(0), list.get(list.size()-1)/2);
            maxOfMinD = Math.max(maxOfMinD, minD);

        }
        

        System.out.print(maxOfMinD);
    }
}