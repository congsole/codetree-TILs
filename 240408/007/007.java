import java.util.*;

class Cls {
    String secret_code;
    char meeting_point;
    int time;

    public Cls(String c, char m, int t) {
        this.secret_code = c;
        this.meeting_point = m;
        this.time = t;
    }
    @Override
    public String toString() {
        return "secret code : " + secret_code + "\nmeeting point : " + meeting_point + "\ntime : " + time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cls cls = new Cls(sc.next(), sc.next().charAt(0), sc.nextInt());
        System.out.print(cls.toString());
    }
}