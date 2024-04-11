import java.util.*;

public class Main {
    public static int n = 15;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);


        for(int A=1; A<=arr[n-1]; A++) {
            for(int B=1; B<=arr[n-1]; B++) {
                for(int C=1; C<=arr[n-1]; C++) {
                    for(int D=1; D<=arr[n-1]; D++) {
                        int[] arr2 = new int[] {
                            A, B, C, D, A + B, B + C, C + D, D + A, A + C, B + D, A + B + C, A + B + D, A + C + D, B + C + D, A + B + C + D
                        };
                        Arrays.sort(arr2);
                        if(Arrays.equals(arr, arr2)) {
                            System.out.print(A + " " + B + " " + C + " " + D);
                            return;
                        }

                    }
                }
            }
        }
    }
}