import java.util.*;

class Command {
    int code;
    int t;
    int x;
    String name;
    int eatCount;
    public Command(int code, int t, int x, String name) {
        this.code = code;
        this.t = t;
        this.x = x;
        this.name = name;
    }
    public Command(int code, int t, int x, String name, int eatCount) {
        this.code = code;
        this.t = t;
        this.x = x;
        this.name = name;
        this.eatCount = eatCount;
    }
    public Command(int code, int t) {
        this.code = code;
        this.t = t;
    }
}

public class Main {
    public static int L, Q;

    public static List<Command> cmd = new ArrayList<>();
    public static Set<String> names = new HashSet<>();

    public static Map<String, Integer> entry_time = new HashMap<>();
    public static Map<String, Integer> position = new HashMap<>();
    public static Map<String, Integer> exit_time = new HashMap<>();
    public static Map<String, List<Command>> sushi = new HashMap<>();

    public static int cmdSort(Command c1, Command c2) {
        if(c1.t != c2.t) return c1.t - c2.t;
        return c1.code - c2.code;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt(); // 초밥 벨트의 길이
        Q = sc.nextInt(); // 명령의 수       
        
        
        for(int i=0; i<Q; i++) {
            int code = sc.nextInt();
            if(code == 100) {
                int t = sc.nextInt();
                int x = sc.nextInt();
                String name = sc.next();
                cmd.add(new Command(100, t, x, name));
                sushi.computeIfAbsent(name, k->new ArrayList<>()).add(new Command(100, t, x, name));
            } else if(code == 200) {
                int t = sc.nextInt();
                int x = sc.nextInt();
                String name = sc.next();
                int eatCount = sc.nextInt();
                cmd.add(new Command(200, t, x, name, eatCount));

                names.add(name);
                entry_time.put(name, t);
                position.put(name, x);
            } else {
                cmd.add(new Command(300, sc.nextInt()));
            }
        }


        for(String name: names) {
            exit_time.put(name, 0);

            for(Command c: sushi.get(name)) {
                int time_to_removed = 0;
                if(c.t < entry_time.get(name)) { // 사람이 오기 전 초밥이 먼저 놓여졌다면
                    // entry_time 때 스시의 위치
                    int t_sushi_x = (c.x + (entry_time.get(name) - c.t)) % L;
                    // 몇 초가 더 지나야 만나는지
                    int additional_time = (position.get(name) - t_sushi_x + L) % L;

                    time_to_removed = entry_time.get(name) + additional_time;
                } else { // 사람이 있을 때 초밥이 놓여졌다면
                    int additional_time = (position.get(name) - c.x + L) % L;
                    time_to_removed = c.t + additional_time;
                }
                exit_time.put(name, Math.max(exit_time.get(name), time_to_removed));
                cmd.add(new Command(111, time_to_removed, -1, name, -1));
            }
        }

        for(String name : names) {
            cmd.add(new Command(222, exit_time.get(name), -1, name, -1));
        }

        cmd.sort((c1, c2) -> cmdSort(c1, c2));

        int peopleCount = 0, sushiCount = 0;

        for(int i=0; i<cmd.size(); i++) {
            if(cmd.get(i).code == 100) sushiCount++;
            if(cmd.get(i).code == 111) sushiCount--;
            if(cmd.get(i).code == 200) peopleCount++;
            if(cmd.get(i).code == 222) peopleCount--;
            if(cmd.get(i).code == 300) System.out.println(peopleCount + " " + sushiCount);
            
            
            
        }

    }
}