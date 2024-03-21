import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String n = sc.next();

        // n을 10진수로 변환 -> num
        int num = 0;
        for(int i=0; i<n.length(); i++) {
            num = num * a + Character.getNumericValue(n.charAt(i));
        }

        // num을 b진수로 변환 -> digit[]
        int[] digit = new int[100];
        int index = 0;
        while(true) {
            if(num < b) {
                digit[index] = num;
                break;
            }
            digit[index] = num % b;
            index++;
            num /= b;
        }
        
        // digit[]를 거꾸로 출력
        for(int i = index; i >= 0; i--) {
            System.out.print(digit[i]);
        }
    }
}