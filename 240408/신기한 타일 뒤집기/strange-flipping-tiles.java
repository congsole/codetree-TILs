import java.util.*;


public class Main {
    public static Map<Integer, String> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int xMin = 0;
        int xMax = 0;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);
            for(int j=1; j<=num; j++) {
                if(dir == 'L') {
                    map.put(x, "White");
                    xMin = Math.min(xMin, x - 1); 
                    if(j < num)
                    x -= 1;
                }
                if(dir == 'R') {
                    map.put(x, "Black");
                    xMax = Math.max(xMax, x + 1);
                    if(j < num)
                    x += 1;
                }
            }
        }
        int wc = 0, bc = 0;
        for(int i=xMin; i<=xMax; i++) {
            if(map.get(i) != null) {
                String color = map.get(i);
                if(color.equals("White")) wc++;
                else if(color.equals("Black")) bc++;
            }
        }

        System.out.print(wc + " " + bc);
    }
}