import java.util.*;

public class Main {
    public static int N, M;
    public static int[] a;
    public static int[] temp;

    public static boolean bomb() {
        int count = 1;
        int startI = 0;
        int endI = 0;
        boolean pop = false;
        for(int i=0; i<a.length; i++) {
            if(i==0 || a[i] != a[i-1]) {
                count = 1;
                startI = i;
            } else if(a[i] == a[i-1]) {
                count++;
                if(i==a.length-1 || a[i] != a[i+1]) {
                    endI = i;
                }
            }
            if(count >= M) {
                bombPop(startI, endI);
                pop = true;
            }
        }
        if(pop) {
            int cnt = 0;
            for(int i=0; i<a.length; i++) {
                if(a[i] > 0) cnt++;
            }
            temp = new int[cnt];
            for(int i=a.length-1; i>=0; i--) {
                if(a[i] > 0) {
                    temp[cnt-1] = a[i];
                    cnt--;
                }
            }
            a = temp;
        }

        return pop;
    }

    public static void bombPop(int startI, int endI) {
        for(int i=startI; i<=endI; i++) {
            a[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        a = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();
        
        boolean result = true;
        while(result) {
            result = bomb();
        }
        

        System.out.println(a.length);
        for(int i=0; i<a.length; i++) {    
            System.out.println(a[i]);
        }
    }
}