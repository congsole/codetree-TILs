import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        int hour = a;
        int min = b;
        int elapsedMin = 0;

        while(true) {
            if(hour == c && min == d) { 
                break;
            }
            min++;
            elapsedMin++;
            if(min == 60) {
                hour++;
                min = 0;
            }
        }

        System.out.println(elapsedMin);
    }
}