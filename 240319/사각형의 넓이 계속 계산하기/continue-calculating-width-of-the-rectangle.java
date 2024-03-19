import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int width = sc.nextInt();
            int length = sc.nextInt();
            String cha = sc.next();
            if(!cha.equals("C")) {
                System.out.println(width*length);
            } else {
                System.out.println(width*length);
                break;
            }
        }
    }
}