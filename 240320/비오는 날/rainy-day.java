import java.util.*;


public class Main {

    public static class WetherInfo {
        public String date;
        public String day;
        public String wether;

        public WetherInfo(String date, String day, String wether) {
            this.date = date;
            this.day = day;
            this.wether = wether;
        }
    }    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WetherInfo[] arr = new WetherInfo[n];
        int index = -1;
        for(int i=0; i<n; i++) {
            arr[i] = new WetherInfo(sc.next(), sc.next(), sc.next());
            if(arr[i].wether.equals("Rain")) {
                if(index == -1) {
                    index = i;
                } else if (arr[i].date.compareTo(arr[index].date) < 0){
                    index = i;
                }
            }
        }
        System.out.print(arr[index].date + " " + arr[index].day + " " + arr[index].wether);

    }
}