import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String c = s.next();
        double a = s.nextDouble(), b = s.nextDouble();
        System.out.printf("%s\n%.2f\n%.2f", c, a, b);
        
        s.close();
    }
}