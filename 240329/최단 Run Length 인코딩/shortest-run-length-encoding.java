import java.util.*;

public class Main {
    
    public static String runLengthEncoding(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] == arr[i-1]) count++;
            else {
                sb.append(arr[i-1]);
                sb.append(count + "");
                count = 1;
            }
            if(i == arr.length-1) {
                sb.append(arr[i]);
                sb.append(count + "");
            }
        }
        return sb.toString();
    }

    public static void rightShift(char[] arr) {
        char temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];
        for(int i=0;i<arr.length;i++) {
            arr[i] = str.charAt(i);
        }
        int minLength = 100000;
        for(int c=0; c<arr.length; c++) {
            rightShift(arr);
            str = runLengthEncoding(arr);
            minLength = Math.min(minLength, str.length());
        }

        System.out.print(minLength);
    }
}