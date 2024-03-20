import java.util.*;

public class Main {
    
    
    static int[] arr;

    public static int get(int n) {
        if(n==0) return arr[0];
        int prod = 1;
        int getnminusone = get(n-1);
        for(int i = 1; i <= 2520; i++) {
            if(i % arr[n] == 0 && i % getnminusone == 0) {
                prod = i;
                break;
            }
        }
        return prod;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(get(n-1));
        
    }
}