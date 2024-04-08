import java.util.*;

public class Main {
    public static int N;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();


        int count = 0;
        for(int i=0; i<N; i++) {
            for(int j=i; j<N; j++) {
                int sum = 0;
                double average = 0;
                boolean ok = false;

                for(int k=i; k<=j; k++) {
                    sum += a[k];    
                }
                average = (double)sum/(j-i+1);
                // System.out.println(average);
                for(int k=i; k<=j; k++) {
                    if(average == a[k]) {
                        ok = true;
                    }    
                }
                if(ok) count++;
            }
        }


        System.out.print(count);

    }
}