import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
    
        scan.close();

        if(a%2 == 1) {
            a += 3;
        } 
        if(a%3 == 0) {
            System.out.print(a/3);
        }
    }
}