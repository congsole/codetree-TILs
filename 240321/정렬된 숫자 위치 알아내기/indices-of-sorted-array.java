import java.util.*;

class Num {
    int firstIndex;
    int value;

    public Num() {

    }

    public Num(int firstIndex, int value) {
        this.firstIndex = firstIndex;
        this.value = value;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Num[] list = new Num[n];
        
        for(int i=0; i<n; i++) {
            list[i] = new Num(i+1, sc.nextInt());
        }

        Arrays.sort(list, (a, b) -> a.value - b.value);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(list[j].firstIndex == i+1) {
                    System.out.print(j+1 + " ");
                }
            }
        }
    }
}