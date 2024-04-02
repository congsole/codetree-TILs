import java.util.*;

class Command {
    int startIndex;
    int endIndex;
    public Command(int x, int y) {
        this.startIndex = x-1;
        this.endIndex = y-1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++)
            list.add(sc.nextInt());

        Command cmd1 = new Command(sc.nextInt(), sc.nextInt());
        Command cmd2 = new Command(sc.nextInt(), sc.nextInt());

        for(int i=0; i<=cmd1.endIndex-cmd1.startIndex; i++) {
            list.remove(cmd1.startIndex);
        }
        for(int i=0; i<=cmd2.endIndex-cmd2.startIndex; i++) {
            list.remove(cmd2.startIndex);
        }

        System.out.println(list.size());
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}