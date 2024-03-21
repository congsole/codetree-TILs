import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] aAt = new int[1000000];
        int[] bAt = new int[1000000];

        int aPoint = 0, bPoint = 0, aTime = 0, bTime = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        char[] aCommand = new char[n];
        int[] aDeltaT = new int[n];
        for(int i=0; i<n; i++) {
            aCommand[i] = sc.next().charAt(0);
            aDeltaT[i] = sc.nextInt();

            if(aCommand[i] == 'R') {
                for(int t = aTime; t< aTime + aDeltaT[i]; t++) {
                    aAt[t] = aPoint++;
                }
                aTime += aDeltaT[i];
            } else {
                for(int t = aTime; t< aTime + aDeltaT[i]; t++) {
                    aAt[t] = aPoint--;
                }
                aTime += aDeltaT[i];
            }

        }

        char[] bCommand = new char[m];
        int[] bDeltaT = new int[m];
        for(int i=0; i<m; i++) {
            bCommand[i] = sc.next().charAt(0);
            bDeltaT[i] = sc.nextInt();

            if(bCommand[i] == 'R') {
                for(int t = bTime; t< bTime + bDeltaT[i]; t++) {
                    bAt[t] = bPoint++;
                }
                bTime += bDeltaT[i];
            } else {
                for(int t = bTime; t< bTime + bDeltaT[i]; t++) {
                    bAt[t] = bPoint--;
                }
                bTime += bDeltaT[i];
            }
        }
        int togetherTime = -1;
        for(int t=1; t<bTime; t++) {
            if(aAt[t] == bAt[t]) {
                togetherTime = t;
                break;
            }
        }
        System.out.print(togetherTime);

    }
}