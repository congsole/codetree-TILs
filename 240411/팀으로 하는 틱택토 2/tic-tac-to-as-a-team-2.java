import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0; i<3; i++) {
            String str = sc.next();
            a[i][0] = str.charAt(0) - '0';
            a[i][1] = str.charAt(1) - '0';
            a[i][2] = str.charAt(2) - '0';
        }

        int count = 0;
        for(int i=1; i<10; i++) {
            loop2: for(int j=i+1; j<10; j++) {
                for(int k=0; k<3; k++) {
                    int numofi = 0, numofj = 0;
                    for(int l=0; l<3; l++) {
                        if(a[k][l] == i) numofi++;
                        if(a[k][l] == j) numofj++;
                    }
                    if(numofi > 0 && numofj > 0 && numofi + numofj == 3) {
                        count++;
                        continue loop2;
                    }
                }
                for(int k=0; k<3; k++) {
                    int numofi = 0, numofj = 0;
                    for(int l=0; l<3; l++) {
                        if(a[l][k] == i) numofi++;
                        if(a[l][k] == j) numofj++;
                    }
                    if(numofi > 0 && numofj > 0 && numofi + numofj == 3) {
                        count++;
                        continue loop2;
                    }
                }
                int numofi = 0, numofj = 0;
                for(int k=0; k<3; k++) {
                    if(a[k][k] == i) numofi++;
                    if(a[k][k] == j) numofj++;    
                }
                if(numofi > 0 && numofj > 0 && numofi + numofj == 3) {
                    count++;
                    continue loop2;
                }
                numofi = 0; numofj = 0;
                for(int k=0; k<3; k++) {
                    if(a[k][3-k-1] == i) numofi++;
                    if(a[k][3-k-1] == j) numofj++;
                    
                }
                if(numofi > 0 && numofj > 0 && numofi + numofj == 3) {
                        count++;
                        continue loop2;
                    }

            }
        }
        System.out.print(count);       
    }
}