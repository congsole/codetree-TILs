import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int count = 0;

        while(!a.equals(b)) {
            a = a.substring(1) + a.charAt(0);
            count++;
        }

        System.out.print(count);
    }
}