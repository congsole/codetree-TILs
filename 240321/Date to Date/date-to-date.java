import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();

        int m = m1, d = d1;
        int elapsedDay = 1;

        int[] daysOfMonth = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true) {
            if(m == m2 && d == d2+1) {
                break;
            }

            d++;
            elapsedDay++;

            if(d == daysOfMonth[m]) {
                d = 1;
                m++;
            }
        }

        System.out.println(elapsedDay);

    }
}