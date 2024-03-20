import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        char[] charArr = str.toCharArray();

        for(int i = length -1; i >=0; i--) {
            if(i%2 == 1) {
                System.out.print(charArr[i]);
            }
        }
    }
}