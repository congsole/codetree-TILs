import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n >= 3000) {
            System.out.print("book");
        } else if(n >= 1000) {
            System.out.print("mask");
        } else if(n >= 500) {
            System.out.print("pen");
        } else {
            System.out.print("no");
        }
    }
}