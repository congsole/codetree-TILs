import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double s = sc.nextDouble();
        
        if (s >= 1.0) {
            System.out.print("High");
        } else if (s <0.5) {
            System.out.print("Low");
        } else {
            System.out.print("Middle");
        }
        
        sc.close();
    }
}