import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = a;
        while(true) {
            if(1920 % i == 0 && 2880 % i == 0) {
                System.out.print(1);
                break;
            }
            i++;
            if(i>b) {
                System.out.print(0);
                break;
            }
        }
    }
}