import java.util.*;

public class Main {

    public static void helloworld(int n) {
        if(n == 0) {
            return;
        } 
        helloworld(n-1);
        System.out.println("HelloWorld");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        helloworld(n);
    }
}