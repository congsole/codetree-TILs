import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        String a2 = a.replace(" ", "");
        String b2 = b.replace(" ", "");

        System.out.println(a2 + b2);
    }
}