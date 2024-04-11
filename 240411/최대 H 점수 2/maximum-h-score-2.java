import java.util.*;

public class Main {
    public static int N, L;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        // H이상인 숫자가 H개 이상 있는 수열...H값의 최댓값 => H점수
        a = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();

        for(int H=100; H>=1; H--) {
            int add = 0;
            int count = 0;
            if(a.length < H) {
                continue;
            }

            for(int i=0; i<N; i++) {
                if(H-a[i]>1) continue;
                else if(H-a[i] < 1) {
                    count++;
                }
                else if(H-a[i] == 1 && add < L) {
                    add++;
                    count++;
                }
            }

            if(count >= H) {
                System.out.print(H);
                return;
            }


        }
    }
}