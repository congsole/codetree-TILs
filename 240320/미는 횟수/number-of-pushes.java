import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int count = 0;

        while(!a.equals(b) && count <= a.length()) {
            a = a.charAt(a.length()-1) + a.substring(0, a.length()-1) ;
            count++;
        }
        if(count > a.length()) {
            System.out.print(-1);
        }
        else
        System.out.print(count);
    }
}