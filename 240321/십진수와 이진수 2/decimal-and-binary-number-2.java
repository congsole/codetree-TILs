import java.util.*;

public class Main {
    
    

    
    public static int toTenth(String n) {
        int num = 0;
        for(int i=0; i<n.length(); i++) {
            num = num * 2 + Character.getNumericValue(n.charAt(i));
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int num = toTenth(n);
        num *= 17;

        int[] binary = new int[100];
        int index = 0;
        
        while(true) {
            if(num < 2) {
                binary[index] = num;
                break;
            }
            binary[index] = num%2;
            index++;
            num /= 2;
        }

        for(int i = index; i >=0; i--) {
            System.out.print(binary[i]);
        }
    }
}