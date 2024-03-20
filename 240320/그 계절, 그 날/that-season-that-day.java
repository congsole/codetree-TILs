import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(!ifExistingDate(y, m, d)) {
            System.out.print(-1);
        } else {
            System.out.print(whichSeason(m));
        }

    }

    static boolean isYun(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    static boolean ifExistingDate(int year, int month, int day) {
        if(month<1 || month>12) {
            return false;
        }
        
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            return day > 0 && day < 31 ? true : false;
        } else if(month == 2) {
            if(isYun(year)) {
                return day > 0 && day <30 ? true : false;
            } else {
                return day > 0 && day <29 ? true : false; 
            }
        } else {
            return day > 0 && day < 32 ? true : false;
        }
    }
    static String whichSeason(int month) {
        if(month >=3 && month <=5) {
            return "Spring";
        } else if(month >=6 && month <=8) {
            return "Summer";
        } else if(month >=9 && month <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }
}