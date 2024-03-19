import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i = 1; i < 5000; i++) {
            n =  n/i;
            cnt++;
            if(n <= 1) {
                break;
            }
        }
        System.out.print(cnt);
    }
}