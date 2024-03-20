import java.util.*;

public class Main {
    
    static int[] arr;

    public static int max(int n) {
        if(n == 0) return arr[0];
        int maximum = max(n-1);
        return arr[n] > maximum ? arr[n] : maximum;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(max(n-1));
    }
}