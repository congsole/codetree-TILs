import java.util.*;

class Line {
    int xi, xj;

    public Line(int xi, int xj) {
        this.xi = xi;
        this.xj = xj;
    }
}


public class Main {
    
    public static void block(int[] x, Line line) {
        for(int i=line.xi; i<=line.xj; i++) {
            x[i]++;
        }
    }

    public static void main(String[] args) {
        int[] x = new int[101];
        for(int i=0; i<101; i++) {
            x[i] = 0;
        }
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Line[] lineArr = new Line[n];
        for(int i=0; i<n; i++) {
            lineArr[i] = new Line(sc.nextInt(), sc.nextInt());
            block(x, lineArr[i]);
        }

        Arrays.sort(x);

        System.out.print(x[100]);



    }
}