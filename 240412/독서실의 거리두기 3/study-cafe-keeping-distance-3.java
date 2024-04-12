import java.util.*;

public class Main {
    public static int n;
    public static char[] a;
    public static List<Integer> dList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String str = sc.next();
        a = str.toCharArray();

        loop1: for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] == '1' && a[j] == '1') {
                    dList.add(j-i);
                    continue loop1;
                }
            }
        }
        Collections.sort(dList, (a, b) -> b-a);
        System.out.print(dList.get(0)/2);

        
    }
}