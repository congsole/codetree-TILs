import java.util.*;

public class Main {
    public static String check(String str) {
        Stack<Character> charStack = new Stack<>();
        char bracket = ' ';

        for(int i=0; i<str.length(); i++) {
            bracket = str.charAt(i);
            if(bracket == '(') 
                charStack.push(bracket);
            else {
                if(charStack.size() == 0) return "No";
                else charStack.pop();
            }
        }
        if(charStack.size() == 0)
            return "Yes";
        else
            return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(check(str));
    }
}