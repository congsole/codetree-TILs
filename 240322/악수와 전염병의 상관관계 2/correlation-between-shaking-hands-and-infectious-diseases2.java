import java.util.*;

class Dev {
    int virus = 0;
    int count;
    
    public Dev(int virus, int count) {
        this.virus = virus;
        this.count = count;
    }

    public void handShake(Dev dev) {
        if(this.virus == 1 & this.count > 0) {
            this.count--;
            if(dev.virus == 0) {
                dev.virus = 1;
            } else if (dev.count > 0){
                dev.count--;
            }
        } else {
            if(dev.virus == 0) {
            } else if (dev.count > 0){
                dev.count--;
            }
        }
    }
}

class Command {
    int t;
    int x;
    int y;

    public Command(int t, int x, int y) {
        this.t = t;
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt(), t = sc.nextInt();

        Dev[] dev = new Dev[n+1];
        for(int i=1; i<=n; i++) {
            dev[i] = new Dev(0, k);
        }
        dev[p].virus = 1;

        Command[] cmd = new Command[t];
        int index = 0;
        while(sc.hasNext()) {
            cmd[index] = new Command(sc.nextInt(), sc.nextInt(), sc.nextInt());
            index++;
        }

        Arrays.sort(cmd, (a,b) -> a.t - b.t);

        for(int i=0; i<t; i++) {
            dev[cmd[i].x].handShake(dev[cmd[i].y]);
        }

        for(int i=1; i<=n; i++) {
            System.out.print(dev[i].virus);
        }


        



    }
}