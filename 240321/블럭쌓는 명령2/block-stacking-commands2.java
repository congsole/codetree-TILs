import java.util.*;

class Range {
    int x, y;

    public Range(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void block(int[] kan, Range range) {
        for(int i=range.x; i<=range.y; i++) {
            kan[i]++;
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] kan = new int[n+1];
        for(int i=0; i<n+1; i++) {
            kan[i] = 0;
        }
        
        int k = sc.nextInt();
        Range[] rangeList = new Range[k];
        for(int i=0; i<k; i++) {
            rangeList[i] = new Range(sc.nextInt(), sc.nextInt());
            block(kan, rangeList[i]);
        }
        
        Arrays.sort(kan);
        System.out.print(kan[n]);

        

    }
}