import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        System.out.printf("%.3f\n%.3f\n%.3f", a, b, c);

        s.close();
    }
}