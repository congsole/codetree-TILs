import java.util.*;

public class Main {
    public static int N;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new int[N];

        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();

        }
        
        int sortedNum = 1;
        for(int i=N-2; i>=0; i--) {
            if(a[i] < a[i+1]) {
                sortedNum++;
            } else {
                break;
            }
        }

        System.out.print(N-sortedNum);
    }
}