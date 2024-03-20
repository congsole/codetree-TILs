import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = str.indexOf("e");

        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, '-');
        System.out.print(sb.toString().replace("-", ""));

    }
}