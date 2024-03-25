import java.util.*;

public class Main {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++) {
            list[i] = sc.nextInt();
        }
        int[] listSorted = list;
        int temp = 0;
        Arrays.sort(listSorted);
        do {
            for(int i=0; i<n-1; i++) {
                if(list[i]>list[i+1]) {
                temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
                }
            }
        } while(!Arrays.equals(list, listSorted));
        for(int i=0; i<n; i++) 
            System.out.print(list[i] + " ");
    }

    
    
}