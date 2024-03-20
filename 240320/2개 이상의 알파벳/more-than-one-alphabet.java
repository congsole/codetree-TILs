import java.util.*;

public class Main {
    public static class YorN {
        private String value;
        public YorN(String value) {
            this.value = value;
        }
    }

    public static void determine(String str, YorN yorn) {
        char[] charArr = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            if(charArr[0] != charArr[i]) {
                yorn.value = "Yes";
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        YorN yorn = new YorN("No");
        determine(str, yorn);
        System.out.print(yorn.value);
    }
}