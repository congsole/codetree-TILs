import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        String str = "";
        int a = 0;

        for(int i=0;i<n;i++) {
            str = sc.next();
            switch(str) {
                case "push":
                    a = sc.nextInt();
                    stack.push(a);
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(stack.peek());
                    break;
            }
        }
    }
}