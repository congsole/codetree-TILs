import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];
        for(int i = 0; i<str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        int count = 0;

        for(int i = 0; i<str.length(); i++) {
            if(arr[i] == '(') {
                for(int j = i+1; j<str.length(); j++) {
                    if(arr[j] == ')') count++;
                }

            }
        }
        System.out.print(count);
    }
}