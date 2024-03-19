import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a%2 == 1) {
            a = a + 3;
        }
        int result = a; 
        if(a%3 == 0) {
            result = a/3;
        }
        System.out.print(result);
    }
}