import java.util.*;

public class Main {
    public static int N, S;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int dff = 0;
        int minDff = 10000;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                int sum = 0;
                if(i != j) {
                    for(int k=0; k<N; k++) {
                        if(k != i && k != j) {
                            sum += arr[k];
                        }       
                    }
                }
                dff = Math.abs(sum - S);
                minDff = Math.min(dff, minDff);
            }
        }

        System.out.print(minDff);
    }
}