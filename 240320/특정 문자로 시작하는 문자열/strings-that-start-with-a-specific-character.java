import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        
        for(int i=0; i<n; i++) {
            strArr[i] = sc.next();
        }

        String cha = sc.next();

        int sum = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(cha.charAt(0) == strArr[i].charAt(0)) {
                count++;
                sum += strArr[i].length();
            }
        }

        System.out.printf("%d %.2f", count, (double)sum/count);
    }
}