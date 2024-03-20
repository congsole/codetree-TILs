import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cmd = sc.nextLine();
        char[] cmdArr = cmd.toCharArray();

        for(char c: cmdArr) {
            if(c == 'L') {
                str = str.substring(1) + str.charAt(0);
                // System.out.println(str);
            } else {
                str = str.charAt(str.length()-1) + str.substring(0, str.length()-1);
                // System.out.println(str);
            }
        }
        System.out.print(str);

    }
}