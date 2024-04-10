import java.util.*;

class Line {
    int start, end;
    public Line(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class Main {
    public static int n;
    public static List<Line> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n; i++)
            list.add(new Line(sc.nextInt(), sc.nextInt()));
    
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    int[] array = new int[101];
                    boolean overlap = false;
                    for(int l=0; l<n; l++) {
                        if(l == i || l == j || l == k) continue;
                        for(int w=list.get(l).start; w<=list.get(l).end; w++) {
                            array[w]++;
                        }
                    }
                    for(int w=0; w<101; w++) {
                        if(array[w] > 1) {
                            overlap = true;
                        }
                    }
                    if(!overlap) count++;
                }
            }
        }
        System.out.print(count);
    }
}