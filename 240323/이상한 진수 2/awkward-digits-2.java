import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int[] a = new int[binary.length()];
        int binaryLength = a.length;
        for(int i=0; i<a.length; i++) {
            a[i] = (char)(binary.charAt(i)-'0');
        }

        int[][] caseStudy = new int[binaryLength-1][binaryLength];
        
        int maxSum = 0;

        for(int i=0; i<binaryLength-1; i++) {
            int sum = 0;
            for(int j=0; j<binaryLength; j++) {
                caseStudy[i][j] = a[j];
                if(j == i+1) caseStudy[i][j] = a[j] ^ 1;
                sum = sum * 2 + caseStudy[i][j];
            }
            maxSum = Math.max(maxSum, sum);    
        }

        System.out.print(maxSum);
    }
}