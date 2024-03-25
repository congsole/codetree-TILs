import java.util.*;

public class Main {

    public static int N;
    
    public static void selectSort(int[] list) {
        // 한 자리씩 검사
        for(int i=0;i<N;i++) {    
            int minIndex = i;
            // i번째 최솟값의 인덱스를 찾는 반복문        
            for(int j=i+1;j<N;j++) { 
                if(list[minIndex]>list[j]) {
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;    
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] list = new int[N];
        for(int i=0;i<N;i++) {
            list[i] = sc.nextInt();
        }
        
        selectSort(list);

        for(int i=0;i<N;i++) {
            System.out.print(list[i] + " ");
        }

    }
}