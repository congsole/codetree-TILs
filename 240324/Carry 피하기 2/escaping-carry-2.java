import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxSum = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    boolean carry = false;
                    
                    // 1의 자리에서 carry 발생하는 경우
                    if(arr[i] % 10 + arr[j] % 10 + arr[k] % 10 >= 10) carry=true;
                    // 10의 자리에서 carry 발생하는 경우
                    if(arr[i] % 100 / 10 + arr[j] % 100 / 10 + arr[k] % 100 /10 >= 10) carry=true;
                    // 100의 자리에서 carry 발생하는 경우
                    if(arr[i] % 1000 / 100 + arr[j] % 1000 / 100 + arr[k] % 1000 / 100 >= 10) carry=true;
                    // 1000의 자리에서 carry 발생하는 경우
                    if(arr[i]  % 10000 / 1000 + arr[j] % 10000 / 1000 + arr[k] % 10000 / 1000 >= 10) carry=true;
                    
                    if(!carry) maxSum = Math.max(maxSum, arr[i] + arr[j] + arr[k]);

                }
            }
        }

        System.out.print(maxSum);


    }
}