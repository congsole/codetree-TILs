import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int result = 0;
        if(a%2 == 1) {
            a = a + 3;
        } 
        if(a%3 == 0) {
            result = a/3;
        }
        System.out.print(result);
    }
}