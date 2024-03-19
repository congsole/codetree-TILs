import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int degree = sc.nextInt();
        if(degree < 0) {
            System.out.print("ice");
        } else if(degree > 100) {
            System.out.print("vapor");
        } else {
            System.out.print("water");
        }
        
        sc.close();
    }
}