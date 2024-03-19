import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int cnt = 0;
        double avg = 0;
        while(true) {
            int age = sc.nextInt();
            if (19 < age && age < 30) {
                sum += age;
                cnt++;
            } else {
                avg = (double)sum/cnt;
                System.out.printf("%.2f", avg);
                break;
            }
        }
    }
}