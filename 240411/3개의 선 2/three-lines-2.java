import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        int minX = 10, minY = 10;
        int maxX = 0, maxY = 0;
        for(int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            maxX = Math.max(maxX, x[i]);
            minX = Math.min(minX, x[i]);
            y[i] = sc.nextInt();
            maxY = Math.max(maxY, y[i]);
            minY = Math.min(minY, y[i]);
        }

        int xLine[] = new int[11];
        int yLine[] = new int[11];
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(x[i] == x[j]) xLine[x[i]] = 1;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(y[i] == y[j]) yLine[y[i]] = 1;
            }
        }
        
        int lineCount = 0;
        for(int i=0; i<11; i++) {
            lineCount = lineCount + xLine[i] + yLine[i];
        }

        if(lineCount < 4) System.out.print(1);
        else System.out.print(0);


    }
}