import java.util.*;

class Number {
    String fullNum;
    int a, b, c;
    int count1, count2;
    public Number(String fullNum, int count1, int count2) {
        this.fullNum = fullNum;
        this.a = fullNum.charAt(0) - '0';
        this.b = fullNum.charAt(1) - '0';
        this.c = fullNum.charAt(2) - '0';
        // System.out.print(a+""+b+""+c + " ");
        this.count1 = count1;
        this.count2 = count2;
        // System.out.println(count1 + " " + count2);
    }
}

public class Main {
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Number[] n = new Number[N];
        for(int i=0; i<N; i++)
            n[i] = new Number(sc.next(), sc.nextInt(), sc.nextInt());

        int cnt = 0;
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                for(int k=1; k<10; k++) {
                    if(i == j || j == k || i == k) continue;
                    // 모든 수에 대해서 해당 수가 정답일 경우 입력에 대해 올바른 카운팅이 되는지 확인한다.
                    boolean ans = true;
                    for(int l=0; l<N; l++) {
                        int cnt1 = 0;
                        int cnt2 = 0;
                        if(n[l].a == i) cnt1++;
                        if(n[l].b == j) cnt1++;
                        if(n[l].c == k) cnt1++;
                        if(n[l].a == j || n[l].a == k) cnt2++;
                        if(n[l].b == k || n[l].b == i) cnt2++;
                        if(n[l].c == i || n[l].c == j) cnt2++;
                        if(n[l].count1 != cnt1 || n[l].count2 != cnt2) {
                            ans = false; 
                            break;
                        }    
                    }
                    if(ans) {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}