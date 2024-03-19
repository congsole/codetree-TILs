import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        dot(n);

    }
    
    public static void dot(int n) {
        int m = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(m+ " ");
                m++;
                if(m == 10) {
                    m = 1;
                }
            }
            System.out.println();
        }
    }
}