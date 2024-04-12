import java.util.*;

public class Main {
    public static int n, aScore, bScore, cScore;
    public static char[] c;
    public static int[] s;
    public static String[] m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = new char[n];
        s = new int[n];
        m = new String[n+1];
        m[0] = "ABC";
        for(int i=0; i<n; i++) {
            c[i] = sc.next().charAt(0);
            s[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(c[i] == 'A') aScore += s[i];
            else if(c[i] == 'B') bScore += s[i];
            else if(c[i] == 'C') cScore += s[i];
            
            if(aScore == bScore && bScore == cScore) m[i+1] = "ABC";
            else if(aScore == bScore && aScore > cScore) m[i+1] = "AB";
            else if(aScore == cScore && aScore > bScore) m[i+1] = "AC";
            else if(bScore == cScore && bScore > aScore) m[i+1] = "BC";
            else if(aScore > bScore && aScore > cScore) m[i+1] = "A";
            else if(bScore > cScore && bScore > aScore) m[i+1] = "B";
            else if(cScore > bScore && cScore > aScore) m[i+1] = "C";
        }

        int count = 0;
        for(int i=1; i<n+1; i++) {
            if(!m[i].equals(m[i-1])) count++;
        }

        System.out.print(count);
    }
}