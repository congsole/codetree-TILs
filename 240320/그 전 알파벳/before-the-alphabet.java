import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.charAt(0);

        if(a == 'a') {
            System.out.print('z');
        } else {
            System.out.print((char)(a-1));
        }

    }
}