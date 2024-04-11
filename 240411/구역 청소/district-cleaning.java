import java.util.*;

public class Main {
    public static int a, b, c, d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int area = 0;
        if(b < c || d < a) {
            area = (b-a) + (d-c);
        } else if(a<c && d<b) {
            area = (b-a);
        } else if(c<a && b<d) {
            area = (d-c);
        } else if(a==c && b==d) {
            area = (d-c);
        } else if(a<c) {
            area = (b-a) + (d-c) - (b-c);
        } else if(c<a) {
            area = (b-a) + (d-c) - (d-a);
        }
        System.out.print(area);
    }
}