import java.util.*;

public class Main {
    public static int[] a = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        Arrays.sort(a);
        if(a[2] - a[1] == 1 && a[1] - a[0] == 1) {
            System.out.print(0);
            return;
        }
        
        if(a[2] - a[1] ==2 || a[1] - a[0] == 2) {
            System.out.print(1);
            return;
        }
        if(a[2] - a[1] > 2 || a[1] - a[0] >2) {
            System.out.print(2);
        }


    }
}