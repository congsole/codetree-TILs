import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int[] bi = new int[binary.length()];

        for(int i=0; i<bi.length; i++) {
            bi[i] = Character.getNumericValue(binary.charAt(i));
        }

        for(int i=0; i<bi.length; i++) {
            if(bi[i] == 0) {
                bi[i] = 1;
                break;
            }
        }

        int sum = 0;
        for(int i=0; i<bi.length; i++) {
            sum = sum * 2 + bi[i];
        }

        System.out.print(sum);
    }
}