import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        System.out.println(i);
        if(i < 0) {
            
            System.out.print("minus");
        }
        
        sc.close();
    }
}