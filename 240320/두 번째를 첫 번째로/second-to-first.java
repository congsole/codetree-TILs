import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char second = str.charAt(1);
        char first = str.charAt(0);
        str = str.replace(second, first);

        System.out.print(str);
    }
}