import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        
        String[] yoil = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Mon"};
        int[] daysOfMonth = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = d2;
        int month = m2;
        int elapsedDay = 0;

        while(true) {
            if(month == m1 && day == d1) {
                break;
            }

            day++;
            elapsedDay++;

            if(day > daysOfMonth[month]) {
                day = 1;
                month++;
            }
        }

        
        System.out.print(yoil[7-(elapsedDay % 7)]);
    }
}