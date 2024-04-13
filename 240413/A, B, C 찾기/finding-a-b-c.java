import java.util.*;
public class Main {
    public static int a, b, c, ab, bc, ca, abc;
    public static int[] arr = new int[7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<7; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        abc = arr[6];
        a = arr[0];
        b = arr[1];
        bc = abc - a;
        c = bc - b;

        System.out.print(a + " " + b + " " + c);
    }
}