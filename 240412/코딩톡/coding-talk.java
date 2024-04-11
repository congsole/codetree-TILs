import java.util.*;

class Message {
    char sender;
    int unread;
    Set<Character> set;
    public Message(char s, int u, int n) {
        this.sender = s;
        this.unread = u;
        this.set = new HashSet<>();
        for(char c='A'; c<'A'+n; c++) {
            set.add(c);
        }
    }
}

public class Main {
    public static int n, m, p;
    public static Message[] msg;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        p = sc.nextInt();
        msg = new Message[m+1];
        for(int i=1; i<=m; i++) {
            msg[i] = new Message(sc.next().charAt(0), sc.nextInt(), n);
        }

        for(int i=1; i<=m; i++) {
            if(msg[i].unread == 0) {
                msg[i].set = new HashSet<>();
            } else {
                for(int j=i; j<=m; j++) {
                    msg[i].set.remove(msg[j].sender);
                }
            }

        }
        
        Iterator it = msg[p].set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }




    }
}