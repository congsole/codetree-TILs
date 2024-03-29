import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[2*n];
        for(int i=0;i<2*n;i++)
            a[i] = sc.nextInt();


        while(t > 0) {
            int temp = a[2*n-1];
            for(int i=2*n-1;i>0; i--)
                a[i] = a[i-1];
            a[0] = temp;
            
            t--;
        }
                
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
        for(int j=n;j<2*n;j++)
            System.out.print(a[j] + " ");


        

    }
}