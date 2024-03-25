import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        String str = sc.next();
        for(int i=0; i<n; i++) {
            list.add(str.charAt(i));
        }

        ListIterator<Character> it = list.listIterator(list.size());
        for(int i=0; i<m; i++) {
            char c = sc.next().charAt(0);
            char cAdd = ' ';
            if(c == 'P') cAdd = sc.next().charAt(0); 
            switch(c) {
                case 'L': if(it.hasPrevious()) it.previous(); break;
                case 'R': if(it.hasNext()) it.next(); break;
                case 'D': if(it.hasNext()) {it.next(); it.remove();} break;
                case 'P': it.add(cAdd); break;
            }
        }

        ListIterator<Character> it2 = list.listIterator();
        while(it2.hasNext())
            System.out.print(it2.next());
    }
}