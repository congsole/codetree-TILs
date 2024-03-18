import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ft = 30.48;
        double n = s.nextDouble();
        System.out.printf("%.1f", n*ft);
        
        s.close();    
    }
}