import java.util.*;

public class Main {
    public static int n, k;
    public static int[] arr;

    public static boolean possible(int maxI) {
        int i=0; 
        if(arr[0] <= arr[maxI]) {
            while(true) {
                for(int j=i+1; j<=i+k; j++) {
                    if(j < n && arr[j] <= arr[maxI]) {
                        i=j;
                        break;
                    } else if(j == n-1 || j == i+k) {
                        return false;
                    }
                }
                if(i == n-1) {
                    return true;
                }
            }


        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 돌 갯수
        k = sc.nextInt(); // 최대 점프 거리
        arr = new int[n];

        for(int i=0; i<n; i++) 
            arr[i] = sc.nextInt();
        
        int minOfMax = 100;
        for(int i=0; i<n; i++) { // 최대값의 인덱스
            if(possible(i)) {
                minOfMax = Math.min(minOfMax, arr[i]);
            }
        }
        
        System.out.print(minOfMax);
        

        
    }
}