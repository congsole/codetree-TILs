public class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            star();
        }
    }
    public static void star() {
        for(int i=0; i<10; i++) {
            if(i == 9) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }
        }
    }
}