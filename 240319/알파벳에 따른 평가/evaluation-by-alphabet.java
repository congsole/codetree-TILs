import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String score = sc.next();
        
        sc.close();

        if(score.equals("S")) {
            System.out.print("Superior");
        } else if(score.equals("A")) {
            System.out.print("Excellent");
        } else if(score.equals("B")) {
            System.out.print("Good"); 
        } else if(score.equals("C")) {
            System.out.print("Usually");
        } else if(score.equals("D")) {
            System.out.print("Effort");
        } else {
            System.out.print("Failure");
        }

    }
}