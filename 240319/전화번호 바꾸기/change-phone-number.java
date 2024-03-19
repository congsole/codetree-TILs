import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.useDelimiter("-");
        String a = sc.next(), b = sc.next(), c = sc.next();
        System.out.printf("%s-%s-%s", a, c, b);
        
        sc.close();
    }
}