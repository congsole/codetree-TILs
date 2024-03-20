import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String a1 = "";
        String b1 = "";
        
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                a1 += a.charAt(i);
            }
        }
        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i) >= '0' && b.charAt(i) <= '9') {
                b1 += b.charAt(i);
            }
        }
        System.out.print(Integer.parseInt(a1) + Integer.parseInt(b1));

    }
}