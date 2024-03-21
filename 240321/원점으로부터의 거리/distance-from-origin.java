import java.util.*;

class Dot implements Comparable<Dot> {
    int x, y;
    int num;

    public Dot(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    public int length() {
        return Math.abs(this.x) + Math.abs(this.y);
    }
    
    @Override
    public int compareTo(Dot dot) {
        if(this.length() == dot.length()) {
            return this.num - dot.num;
        }
        return this.length() - dot.length();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dot[] list = new Dot[n];

        for(int i=0; i<n; i++) {
            list[i] = new Dot(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(list);
        for(int i=0; i<n; i++) {
            System.out.println(list[i].num);
        }
        
    }
}