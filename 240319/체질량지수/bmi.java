import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        height = height/100.0;
        double bmi = weight/height/height;
        System.out.printf("%.0f\n", bmi);
        
        if( bmi>=25) {
            System.out.print("Obesity");
        }
        
        sc.close();
    }
}