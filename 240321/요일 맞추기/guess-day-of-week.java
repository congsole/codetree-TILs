import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        
        String[] yoil = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Mon"};
        int[] daysOfMonth = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day;
        int month;
        int elapsedDay = 0;
        int limitDay;
        int limitMonth;

        if(m1 < m2) {
            month = m1;
            limitMonth = m2;
            day = d1;
            limitDay = d2;
        } else if(m1 == m2) {
            if(d1 < d2) {
                month = m1;
                limitMonth = m2;
                day = d1;
                limitDay = d2;
            } else {
                month = m2;
                limitMonth = m1;
                day = d2;
                limitDay = d1;                
            }
        } else {
            month = m2;
            limitMonth = m1;
            day = d2;
            limitDay = d1;
        }

        while(true) {
            if(month == limitMonth && day == limitDay) {
                break;
            }

            day++;
            elapsedDay++;

            if(day > daysOfMonth[month]) {
                day = 1;
                month++;
            }
        }

        if(m1 < m2) {
            System.out.print(yoil[elapsedDay % 7]);
        } else if(m1 == m2) {
            if(d1 < d2) {
                System.out.print(yoil[elapsedDay % 7]);
            } else {
                System.out.print(yoil[7-(elapsedDay % 7)]);
            }
        } else {
            System.out.print(yoil[7-(elapsedDay % 7)]);
        }



    }
}