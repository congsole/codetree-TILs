import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = 100;
        int cha;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    if(arr[i] > arr[j]) {
                        cha = arr[i] - arr[j];
                    } else {
                        cha = arr[j] - arr[i];
                    }
                    if(cha < min) {
                        min = cha;
                    }
                }
            }
        }
        System.out.println(min);
    }
}