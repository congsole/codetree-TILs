import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt(), b = s.nextInt();
        System.out.printf("%d %d", a, b);
        
        s.close();
    }
}