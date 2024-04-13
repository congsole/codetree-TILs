import java.util.*;

public class Main {
    public static int N;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new int[N];

        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        
        // 특정 인덱스부터 맨 뒤 까지 정렬되어 있다면 그 인덱스의 앞쪽에 있는 수들만 적절한 위치로 옮기면 된다.
        // 맨 뒤부터 정렬되어있는 수의 갯수를 센다.
        
        int sortedNum = 1;
        for(int i=N-2; i>=0; i--) {
            if(a[i] < a[i+1]) {
                sortedNum++;
            } else {
                break;
            }
        }
        // 전체 갯수에서 맨뒤 정렬 갯수를 뺀다.
        System.out.print(N-sortedNum);
    }
}