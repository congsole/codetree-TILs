import java.util.*;

public class Main {
    public static Integer c;
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            String command = sc.next();
            if(command.equals("push_front") || command.equals("push_back"))
            c = new Integer(sc.nextInt());
            switch(command) {
                case "push_front": list.addFirst(c); break;
                case "push_back": list.addLast(c); break;
                case "pop_front": System.out.println(list.pollFirst()); break;
                case "pop_back": System.out.println(list.pollLast()); break;
                case "size": System.out.println(list.size()); break;
                case "empty": System.out.println(list.isEmpty() ? 1 : 0); break;
                case "front": System.out.println(list.peekFirst()); break;
                case "back": System.out.println(list.peekLast()); break;
            }
        }
        
    }
}