import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        int cnt = 0;
        int index = 0;
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 2) {
                cnt++;
                if(cnt == 3) {
                    index = i;
                }
            }
            
        }
        System.out.println(index);
    }
}