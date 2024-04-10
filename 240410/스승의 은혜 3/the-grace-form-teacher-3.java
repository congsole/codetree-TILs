import java.util.*;

class Gift {
    int price;
    int deli;
    int sum;
    public Gift(int p, int d) {
        this.price = p;
        this.deli = d;
        this.sum = this.price + this.deli;
    }
}

public class Main {
    public static int N, B;
    public static List<Gift> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        B = sc.nextInt();

        for(int i=0; i<N; i++)
            list.add(new Gift(sc.nextInt(), sc.nextInt()));

        Collections.sort(list, (a, b) -> a.sum - b.sum);

        int maxCount = 0;
        for(int i=0; i<N; i++) {
            int pay = 0;
            int count = 0;
            for(int j=0; j<N; j++) {
                int initialPay = pay;
                if(i == j) {
                    pay = pay + list.get(j).price/2 + list.get(j).deli;
                } else {
                    pay = pay + list.get(j).sum;
                }
                if(pay <= B) {
                    count++;
                } else {
                    pay = initialPay;
                }
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}