import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        Arrays.sort(a); Arrays.sort(b);
        String result = "Yes";
        for(int i = 0; i < n; i++) {
            if(a[i] != b[i]) {
                result = "No";
                break;
            }
        }
        System.out.print(result);
    }
}