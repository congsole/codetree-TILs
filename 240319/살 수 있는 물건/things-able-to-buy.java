import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (n >= 3000) {
            System.out.print("book");
        } else if (n < 1000) {
            System.out.print("no");
        } else {
            System.out.print("mask");
        }
        
        sc.close();
    }
}