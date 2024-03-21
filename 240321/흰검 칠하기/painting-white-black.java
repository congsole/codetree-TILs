import java.util.*;

class Tile {
    char color;
    int bcnt;
    int wcnt;

    public Tile(char c, int a, int b) {
        this.color = c;
        this.bcnt = a;
        this.wcnt = b;
    }

    public void setColor(char c) {
        this.color = c;
        if(c=='W') {
            this.wcnt++;
        } else if(c=='B') {
            this.bcnt++;
        }
        if(this.bcnt >= 2 && this.wcnt >= 2) {
            this.color = 'G';
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Tile[] tiles = new Tile[100000];
        for(int i=0; i<100000; i++) {
            tiles[i] = new Tile('N', 0, 0);
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] length = new int[n];
        String[] direction = new String[n];
        int currX = 50000;

        for(int i=0; i<n; i++) {
            length[i] = sc.nextInt();
            direction[i] = sc.next();
        }
        for(int i=0; i<n; i++) {
            if(direction[i].equals("R")) {
                for(int j=currX; j<currX+length[i]; j++) {
                    tiles[j].setColor('B');
                }
                currX = currX + length[i] -1;
            } else {
                for(int j=currX; j>currX-length[i]; j--) {
                    tiles[j].setColor('W');
                }
                currX = currX - length[i] +1;
            }
        }

        int WhiteCount = 0;
        int BlackCount = 0;
        int GrayCount = 0;
        for(int i = 0; i < 100000; i++) {
            if(tiles[i].color == 'W') WhiteCount++;
            else if(tiles[i].color == 'B') BlackCount++;
            else if(tiles[i].color == 'G') GrayCount++;
        }

        System.out.println(WhiteCount + " " + BlackCount + " " + GrayCount);
        
    }
}