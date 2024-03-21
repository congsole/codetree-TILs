import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        String a = sc.next();


        int[] lastDayOf = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] yoil = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    
        int elapsedDays = 0;
        int month = m1; 
        int day = d1;

        while(true) {
            if(month == m2 && day == d2) {
                break;
            }
            
            day++;
            elapsedDays++;
            
            if(day > lastDayOf[month]) {
                day = 1;
                month++;
            }
        }

        int result = elapsedDays/7;
        if(elapsedDays % 7 <= Arrays.asList(yoil).indexOf(a)+1) {
            result++;
        }

        
        System.out.println(result);
    }
}