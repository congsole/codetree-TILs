import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            String cmd = sc.next();

            if(cmd.equals("push_back")) {
                int item = sc.nextInt();
                list.add(item);
            } else if(cmd.equals("get")) {
                int index = sc.nextInt();
                System.out.println(list.get(index-1));
            } else if(cmd.equals("size")) {
                System.out.println(list.size());
            } else if(cmd.equals("pop_back")){
                list.remove(list.size()-1);
            }
        }
    }
}