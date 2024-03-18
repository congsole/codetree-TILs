import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double a = s.nextDouble();
        System.out.printf("%.2f", a + 1.5);

        s.close();
    }
}