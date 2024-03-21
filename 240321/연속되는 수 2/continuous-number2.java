import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        int count = 1;
        List<Integer> cnt = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                count = 1;
            } else if(arr[i] == arr[i-1]){
                count++;
                if (i == n-1) {
                    cnt.add(count);
                }
            } else {
                cnt.add(count);
                count = 1;
            }
        }

        System.out.print(Collections.max(cnt));

    }
}