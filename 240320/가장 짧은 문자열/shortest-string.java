import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int al = a.length();
        int bl = b.length();
        int cl = c.length();
        int min = al;
        int max = al;
        if(bl < min) {
            min = bl;
        } 
        if(cl < min) {
            min = cl;
        }
        if(bl > max) {
            max = bl;
        } 
        if(cl > max) {
            max = cl;
        }

        System.out.print(max-min);
    }
}