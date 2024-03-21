import java.util.*;

class Range {
    int xi, xj;

    public Range(int a, int b) {
        this.xi = a;
        this.xj = b;
    }
}

public class Main {

    public static final int OFFSET = 100;

    public static void startPoint(int[] x, Range range) {
        for(int i = range.xi; i < range.xj; i++) {
            x[i]++;
        }
    }

    public static void main(String[] args) {
        int[] x = new int[201];
        for(int i=0; i<201; i++) {
            x[i] = 0;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Range[] rangeList = new Range[n];
        for(int i = 0; i < n; i++) {
            rangeList[i] = new Range(sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);
            startPoint(x, rangeList[i]);
        }

        Arrays.sort(x);
        System.out.print(x[200]);
    }
}