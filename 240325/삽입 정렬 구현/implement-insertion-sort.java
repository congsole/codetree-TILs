import java.util.*;

public class Main {
    public static int N;
    public static void insertionSort(int[] list) {
        for(int i=0;i<N;i++) {
            int key = list[i];
            int j = i-1;
            while(j >= 0 && list[j] > key) {  
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] list = new int[N];
        for(int i=0; i<N; i++) {
            list[i] = sc.nextInt();
        }

        //정렬
        insertionSort(list);

        //출력
        for(int i=0;i<N;i++) {
            System.out.print(list[i] + " ");
        }


    }
}