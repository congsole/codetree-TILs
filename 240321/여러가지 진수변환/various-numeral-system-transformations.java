import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = sc.nextInt();
        int[] digit = new int[100];
        int index = 0;

        while(true) {
            if(num < b) {
                digit[index] = num;
                break;
            }

            digit[index] = num % b;
            num /= b;
            index++;
        }

        for(int i = index; i>=0 ; i--) {
            System.out.print(digit[i]);
        }
    }
}