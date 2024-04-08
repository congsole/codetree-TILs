import java.util.*;

public class Main {
    public static int n, count;
    public static List<Integer> list = new ArrayList<>();
    public static boolean isBeautiful(List<Integer> list) {
        int cnt = 1;
        boolean is = true;
        if(list.size() == 1) {
            if(list.get(0) != 1) is = false;
        }
        for(int i=1; i<list.size(); i++) {
            if(list.get(i) == list.get(i-1)) {
                cnt++;
            } else if(list.get(i) != list.get(i-1)) {
                if(cnt % list.get(i-1) != 0) {
                    is = false;
                    break;
                }
                cnt=1;
            }
            if(i == list.size() -1) {
                if(cnt % list.get(i) != 0) {
                    is = false;
                    break;
                }
            }
        }
        return is;
    }
    public static void choose(int num) {
        if(num == n+1) {
            if(isBeautiful(list)) count++;
            return;
        }
        for(int i=1; i<=4; i++) {
            list.add(i);
            choose(num+1);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        choose(1);
        System.out.print(count);
    }
}