import java.util.*;

public class Main {
    public static int N;
    public static char[] line = new char[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0; i<101; i++) {
            line[i] = ' ';
        }
        for(int i=0; i<N; i++) {
            line[sc.nextInt()] = sc.next().charAt(0);
        }

        int maxSize = 0;
        for(int i=0; i<101; i++) {
            for(int j=i; j<101; j++) {
                if(line[i] != ' ' && line[j] != ' ') {
                    int size = j-i;
                    int countG = 0, countH = 0;
                    for(int k=i; k<=j; k++) {
                        if(line[k] == 'G') countG++;
                        if(line[k] == 'H') countH++;
                    }
                    if(countG == countH || countG == 0 || countH == 0)
                    maxSize = Math.max(maxSize, size);
                }
            }
        }
        System.out.print(maxSize);
    }
}