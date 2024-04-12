import java.util.*;

public class Main {
    public static int n;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int zeroIndex = -1;
        int zeroCount = 0;
        int minusCount = 0;
        int plusCount = 0;
        for(int i=0; i<n; i++) {
            if(a[i] < 0) minusCount++;
            else if(a[i] == 0) {
                zeroIndex = i;
                zeroCount++;
            } else plusCount++;
        }

        int product = -1;
        // 음수만 있는 경우
        if(plusCount == 0 && zeroCount == 0 && minusCount > 0) product = a[n-1] * a[n-2] * a[n-3];

        // 0만 있는 경우
        else if(plusCount == 0 && zeroCount > 0 && minusCount == 0) product = 0;
        
        // 양수만 있는 경우
        else if(plusCount > 0 && zeroCount == 0 && minusCount == 0) product = a[n-1] * a[n-2] * a[n-3];
        // 음수와 0이 있는 경우
        else if(plusCount == 0 && zeroCount > 0 && minusCount > 0) product = 0;
        // 0과 양수가 있는 경우
        else if(plusCount > 0 && zeroCount > 0 && minusCount == 0) product = a[n-1] * a[n-2] * a[n-3];
        // 음수와 양수가 있는 경우
        else if(plusCount > 0 && zeroCount == 0 && minusCount > 0) {
             int maxProduct = -1000000000;
             // 양수
                // 양3, 음0
                if(plusCount >= 3) {
                    product = a[n-1] * a[n-2] * a[n-3];
                    maxProduct = Math.max(product, maxProduct);
                }
                // 양1, 음2
                if(plusCount >=1 && minusCount >=2) {
                    product = a[0] * a[1] * a[n-1];
                    maxProduct = Math.max(product, maxProduct);
                }
             // 음수
                // 양2, 음1
                if(plusCount >=2 && minusCount >=1) {
                    product = a[minusCount] * a[minusCount-1] * a[minusCount+1];
                    maxProduct = Math.max(product, maxProduct);
                }
                // 양0, 음3
                if(minusCount >= 3) {
                    product = a[minusCount - 1] * a[minusCount - 2] * a[minusCount - 3];
                    maxProduct = Math.max(product, maxProduct);
                }
            product = maxProduct;
        }
        // 음수, 0, 양수가 있는 경우
        else if(plusCount > 0 && zeroCount > 0 && minusCount > 0) {
            int maxProduct = -1000000000;
            // 양수
                // 양3, 음0
                if(plusCount >= 3) {
                    product = a[n-1] * a[n-2] * a[n-3];
                    maxProduct = Math.max(product, maxProduct);
                }
                // 양1, 음2
                if(plusCount >=1 && minusCount >=2) {
                    product = a[0] * a[1] * a[n-1];
                    maxProduct = Math.max(product, maxProduct);
                }
            // 0
                product = 0;
                maxProduct = Math.max(product, maxProduct);
            // 음수
                // 양2, 음1
                if(plusCount >=2 && minusCount >=1) {
                    product = a[minusCount] * a[minusCount-1] * a[minusCount+1];
                    maxProduct = Math.max(product, maxProduct);
                }
                // 양0, 음3
                if(minusCount >= 3) {
                    product = a[minusCount - 1] * a[minusCount - 2] * a[minusCount - 3];
                    maxProduct = Math.max(product, maxProduct);
                }
            product = maxProduct;
        }
    
        System.out.print(product);
    }


}