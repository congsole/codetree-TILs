import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 0;
        String str;
        for(int i=0; i<N; i++) {
            str = sc.next();
            if(str.equals("push")) 
                qu.add(sc.nextInt());
            else if(str.equals("pop")) 
                System.out.println(qu.poll());
            else if(str.equals("size"))
                System.out.println(qu.size());
            else if(str.equals("empty"))
                System.out.println(qu.isEmpty() ? 1 : 0);
            else    
                System.out.println(qu.peek());
        }
    }
}