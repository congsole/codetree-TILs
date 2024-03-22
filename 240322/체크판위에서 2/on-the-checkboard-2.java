import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] arr = new char[r][c];
        for(int i=0; i<r; i++) 
            for(int j=0; j<c; j++)
                arr[i][j] = sc.next().charAt(0);
        
        int count = 0;
        for(int i=1; i<r-1; i++) {
            for(int j=1; j<c-1; j++) {
                if(arr[i][j] != arr[0][0]) {
                    for(int k=i+1; k<r-1; k++) {
                        for(int l=j+1; l<c-1; l++) {
                            if(arr[k][l] == arr[0][0]) count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    
    }
}