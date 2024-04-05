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
class Belt {
    List<String> list = new ArrayList<>();
    
    public void addSushi(String name) {
        list.add(name);
    }
}
class Chair {
    String name;
    int count;
    public Chair(String name, int count) {
        this.name = name;
        this.count = count;
    }
}
public class Main {
    public static int L, Q;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt(); // 초밥 벨트의 길이
        Q = sc.nextInt(); // 명령의 수       
        
        Command[] cmd = new Command[Q];
        for(int i=0; i<Q; i++) {
            int code = sc.nextInt();
            if(code == 100) {
                cmd[i] = new Command(100, sc.nextInt(), sc.nextInt(), sc.next());
            } else if(code == 200) {
                cmd[i] = new Command(200, sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
            } else {
                cmd[i] = new Command(300, sc.nextInt());
            }
        }
        int maxT = cmd[Q-1].t;

        Belt[] belt = new Belt[L];
        for(int i=0; i<L; i++) {
            belt[i] = new Belt();
        }

        Chair[] chair = new Chair[L];
        
        int currT = 1;

        while(currT <= maxT) {
            // 회전
            Belt temp = belt[L-1];
            for(int i=L-1; i>=1; i--) {
                belt[i] = belt[i-1];
            }
            belt[0] = temp;

            // 스시 놓기, 앉기, 사진찍기
            for(int i=0; i<Q; i++) {
                if(cmd[i].t == currT) {
                    if(cmd[i].code == 100) {
                        belt[cmd[i].x].addSushi(cmd[i].name);
                    } else if(cmd[i].code == 200) {
                        chair[cmd[i].x] = new Chair(cmd[i].name, cmd[i].eatCount);
                    } else if(cmd[i].code == 300) {
                        int peopleSum = 0;
                        int sushiSum = 0;
                        for(int x=0; x<L; x++) {
                            if(chair[x] != null) peopleSum++;
                            sushiSum += belt[x].list.size();
                        }
                        System.out.print(peopleSum + " " + sushiSum);
                        System.out.println();
                    }
                } else {
                    for(int x=0; x<L; x++) {
                        if(chair[x] != null) {
                            while(true) {
                                if(belt[x].list.indexOf(chair[x].name) < 0) {
                                    break;
                                }
                                belt[x].list.remove(chair[x].name);
                                chair[x].count--;
                            }
                            if(chair[x].count == 0) {
                                chair[x] = null;
                            }
                        }
                    }
                }
            }
     
            // 시간 증가
            currT++;
        }
    }
}