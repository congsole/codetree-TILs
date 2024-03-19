import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();    
        sc.close();
        System.out.print(haha(n,m));
    }
    public static int haha(int n, int m) {
        int result = m;
        
        for(int i = 1; i <= 10000; i++) {
            if(i%n == 0 && i%m == 0) {
                result = i;
                break;
            }
        }
        
        return result; 
    }
}