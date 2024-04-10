import java.util.*;

public class Main {
    public static int X, Y;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();

        int beautifulCount = 0;
        
        for(int n=X; n<=Y; n++) {
            String str = n + "";
            char[] arr = str.toCharArray();
            int count = 1;
            for(int i=1; i<arr.length; i++) {
                if(arr[i] == arr[0]) count++;
            }
            if(count == arr.length-1) beautifulCount++;
            if(count == 1) {
                for(int i=2; i<arr.length; i++) {
                    if(arr[i] == arr[1]) count++;
                }
                if(count == arr.length-1) beautifulCount++;
            }
        }
        System.out.print(beautifulCount);
    }
}