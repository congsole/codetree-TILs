import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int cnt = 0;

        while(true) {
            int idx = a.indexOf(b);
            if(idx > -1) {
                cnt++;
                a = a.substring(idx+2);
            } else {
                break;
            }
        }
        System.out.print(cnt);
    }
}