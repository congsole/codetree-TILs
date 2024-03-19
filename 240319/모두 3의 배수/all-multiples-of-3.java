import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i <5; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%3 != 0) {
                System.out.print(0);
                break;
            } else {
                if(i == 4) {
                    System.out.print(1);
                }
            }
        }


    }
}