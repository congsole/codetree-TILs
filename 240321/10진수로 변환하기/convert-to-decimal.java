import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();

        int sum = 0;

        for(int i = 0; i < digits.length(); i++) {
            sum = sum * 2 + Character.getNumericValue(digits.charAt(i));
        }

        System.out.print(sum);
    }
}