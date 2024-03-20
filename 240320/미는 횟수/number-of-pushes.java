import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int count = 0;

        while(true) {
            a = a.substring(1) + a.charAt(0);
            count++;
            if(a.equals(b)) {
                break;
            }
        }

        System.out.print(count);
    }
}