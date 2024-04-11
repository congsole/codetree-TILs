import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int minSum = 99*99;
        for(int i=0; i<n; i++) {
            a[i] = a[i] * 2;
            for(int j=0; j<n; j++) {
                List<Integer> list = new ArrayList<>();
                for(int k=0; k<n; k++) {
                    if(k != j) {
                        list.add(a[k]);
                    }
                }
                int sum = 0;
                for(int k=1; k<n-1; k++) {
                    sum += Math.abs(list.get(k)-list.get(k-1));
                }
                minSum = Math.min(sum, minSum);
            }
            a[i] = a[i] / 2;
        }

        System.out.print(minSum);
    }
}