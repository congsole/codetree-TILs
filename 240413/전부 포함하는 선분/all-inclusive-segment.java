import java.util.*;

class Line {
    int num;
    int a, b;
    public Line(int n, int a, int b) {
        this.num = n;
        this.a = a;
        this.b = b;
    }
}

public class Main {
    public static int n;
    public static Line[] line;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        line = new Line[n];

        for(int i=0; i<n; i++) {
            line[i] = new Line(i, sc.nextInt(), sc.nextInt());
        }
        
        int minLength = 99;
        
        // i) 가장 왼쪽을 제거하는 경우
        Arrays.sort(line, (l1, l2) -> l1.a - l2.a);
        int num1 = line[0].num;
        int x1 = line[1].a;
        Arrays.sort(line, (l1, l2) -> l2.b - l1.b);
        int num2 = line[0].num;
        int x2 = 0;
        if(num1 == num2) {
            x2 = line[1].b;
        } else {
            x2 = line[0].b;
        }
        minLength = Math.min(minLength, x2 - x1);

        // 가장 오른쪽의 하나를 제거하는 경우
        Arrays.sort(line, (l1, l2) -> l2.b - l1.b);
        num2 = line[0].num;
        x2 = line[1].b;
        
        Arrays.sort(line, (l1, l2) -> l1.a - l2.a);
        num1 = line[0].num;
        if(num1 == num2) {
            x1 = line[1].a;
        } else {
            x1 = line[0].a;
        }
        minLength = Math.min(minLength, x2 - x1);

        System.out.print(minLength);




    }
}