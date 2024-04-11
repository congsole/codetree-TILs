import java.util.*;

public class Main {
    public static int n, m;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int minOfMaxSum = 10000;
        for(int maxSum=1; maxSum<=10000; maxSum++) {
            boolean possible = true;

            int section = 1;
            int sectionSum = 0;

            for(int i=0; i<n; i++) {
                if(arr[i] > maxSum) {
                    possible = false;
                    break;
                }

                if(sectionSum + arr[i] > maxSum) {
                    section++; // 다음 섹션으로 넘어감
                    sectionSum = 0; // 다음 섹션의 합
                }
                
                sectionSum += arr[i];
                
            }
            //section을 m개 이하의 구간으로 나눴을 경우 최대합이 A였다면,
            // section을 m개의 구간으로 나눴을때도 최대합이 A 이하임을 수학적으로 증명할 수 있습니다.
            if(possible && section <= m) {
                System.out.print(maxSum);
                return;  
                // minOfMaxSum = Math.min(minOfMaxSum, maxSum);
            }   
        }
        // System.out.print(minOfMaxSum);
    }
}