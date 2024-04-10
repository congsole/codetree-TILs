import java.util.*;

class Eat {
    int num;
    int cheese;
    int t;
    public Eat(int n, int c, int t) {
        this.num = n;
        this.cheese = c;
        this.t = t;
    }
}
class Sick {
    int num;
    int t;
    public Sick(int num, int t) {
        this.num = num;
        this.t = t;
    }
}

public class Main {
    public static int N, M, D, S;
    public static List<Eat> eatList = new ArrayList<>();
    public static List<Sick> sickList = new ArrayList<>();
    public static Map<Integer, Integer> sickCheeseList = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 사람의 수
        M = sc.nextInt(); // 치즈의 수... 정확히 하나의 치즈가 상했음
        D = sc.nextInt(); // 치즈를 먹은 기록의 수... 상한 치즈를 먹은 사람은 약을 복용해야함
        S = sc.nextInt(); // 아픈 기록의 수

        for(int i=0; i<D; i++) {
            eatList.add(new Eat(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        for(int i=0; i<S; i++) {
            sickList.add(new Sick(sc.nextInt(), sc.nextInt()));
        }

        for(int i=1; i<=M; i++) {
            sickCheeseList.put(i, 0);
        }
        for(int i=0; i<S; i++) {
            int peopleNum = sickList.get(i).num;
            int sickTime = sickList.get(i).t;
            for(int j=0; j<D; j++) {
                if(eatList.get(j).num == peopleNum && eatList.get(j).t < sickTime) {
                    int cheeseNum = eatList.get(j).cheese;
                    sickCheeseList.put(cheeseNum, sickCheeseList.get(cheeseNum)+1);
                }
            }
        }
        int maxPillCount = 0;
        for(int i=1; i<=M; i++) {
            if(sickCheeseList.get(i) == S) {
                Set<Integer> pillList = new HashSet<>();
                for(int j=0; j<D; j++) {
                    if(eatList.get(j).cheese == i) {
                        pillList.add(eatList.get(j).num);
                    }
                }
                int pillCount = pillList.size();
                maxPillCount = Math.max(pillCount, maxPillCount);
            }
        }

        System.out.print(maxPillCount);

    }
}