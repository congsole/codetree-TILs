import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n+1];
        int m = sc.nextInt();
        int k = sc.nextInt();

        int firstStudentIndex = -1;

        while(m-->0) {
            int num = sc.nextInt();
            student[num]++;
            if(student[num] == k) {
                firstStudentIndex = num;
                break;
            }
        }
        System.out.print(firstStudentIndex);
    }
}