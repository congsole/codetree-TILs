import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int day = 11;
        int hour = 11;
        int min = 11;
        int elapsedMins = 0;
        
        if(a <= 11) {
            if(b <= 11) {
                if(c < 11) {
                    System.out.print(-1);
                    return;
                }
            }
        }

        while(true) {
            if(day == a && hour == b && min == c) {
                break;
            }

            min++;
            elapsedMins++;

            if(min == 60) {
                min = 0;
                hour++;
                if(hour == 24) {
                    hour = 0;
                    day++;
                }
            }
        }

        System.out.println(elapsedMins);

    }
}