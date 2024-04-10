import java.util.*;

public class Main {
    public static int N, B;
    public static int[] price;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 학생 수
        B = sc.nextInt(); // 예산
        price = new int[N];

        for(int i=0; i<N; i++)
            price[i] = sc.nextInt();
        
        Arrays.sort(price);

        int maxCount = 0;
        for(int i=0; i<N; i++) {
            int count = 0;
            int pay = 0;
            for(int j=0; j<N; j++) {
                if(i == j) {
                    pay += price[j]/2;
                } else {
                    pay += price[j];
                }
                if(pay <= B) {
                    count++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}