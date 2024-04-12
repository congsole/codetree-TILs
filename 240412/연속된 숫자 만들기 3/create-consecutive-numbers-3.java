import java.util.*;

public class Main {
    public static int[] a = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            a[i] = sc.nextInt();
        }
        
        if(a[2] - a[1] == 1 && a[1] - a[0] == 1) {
            System.out.print(0);
            return;
        } else {
            System.out.print(Math.max((a[2] - a[1] - 1), (a[1] - a[0] - 1)));
        }




    }
}