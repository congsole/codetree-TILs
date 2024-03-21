import java.util.*;

class Line {
    int xi;
    int xj;
    int length;
    String dir;

    public Line(int length, String dir) {
        this.length = length;
        this.dir = dir;
    }
}

public class Main {
    
    public static void check(Line line, int[] checked) {
        for(int i=line.xi; i<line.xj; i++) {
            checked[i]++;
        }
    }

    

    public static void main(String[] args) {
        int[] checked = new int[2000];
        for(int i=0; i<2000; i++) {
            checked[i] = 0;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr = 1000;
        
        Line[] lines = new Line[n];
        for(int i=0; i<n; i++) {
            lines[i] = new Line(sc.nextInt(), sc.next());
            if(lines[i].dir.equals("R")) {
                lines[i].xi = curr;
                lines[i].xj = curr = curr + lines[i].length;
            } else {
                lines[i].xj = curr;
                lines[i].xi = curr = curr - lines[i].length;
            }
            check(lines[i], checked);    
        }

        int count = 0;
        for(int i=0; i<2000; i++) {
            if(checked[i]>=2) {
                count++;
            }
        }    

        System.out.print(count);

        


        


    }
}