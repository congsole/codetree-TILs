import java.util.*;

class Rotation {
    int row, col, leng1, leng2, leng3, leng4, dir;
    public Rotation(int row, int col, int leng1, int leng2, int leng3, int leng4, int dir) {
        this.row = row-1;
        this.col = col-1;
        this.leng1 = leng1;
        this.leng2 = leng2;
        this.leng3 = leng3;
        this.leng4 = leng4;
        this.dir = dir;
    }
}



public class Main {
    public static void rotate(Rotation rtt) {
        if(rtt.dir == 0) {
            int[] dr = new int[]{-1, -1, +1, +1};
            int[] dc = new int[]{-1, +1, +1, -1};
            int temp = matrix[rtt.row][rtt.col];
            int row = rtt.row, col = rtt.col;
            for(int i=0; i<rtt.leng4; i++) {
                matrix[row + i*dr[0]][col + i*dc[0]] = matrix[row + (i+1)*dr[0]][col + (i+1)*dc[0]];
            }
            row += rtt.leng4*dr[0];
            col += rtt.leng4*dc[0];
            for(int i=0; i<rtt.leng3; i++) {
                matrix[row + i*dr[1]][col + i*dc[1]] = matrix[row + (i+1)*dr[1]][col + (i+1)*dc[1]];
            }
            row += rtt.leng3*dr[1];
            col += rtt.leng3*dc[1];
            for(int i=0; i<rtt.leng2; i++) {
                matrix[row + i*dr[2]][col + i*dc[2]] = matrix[row + (i+1)*dr[2]][col + (i+1)*dc[2]];
            }
            row += rtt.leng2*dr[2];
            col += rtt.leng2*dc[2];
            for(int i=0; i<rtt.leng1-1; i++) {
                matrix[row + i*dr[3]][col + i*dc[3]] = matrix[row + (i+1)*dr[3]][col + (i+1)*dc[3]];
            }
            matrix[rtt.row + dr[1]][rtt.col + dc[1]] = temp;


        } else {
            int[] dr = new int[]{-1, -1, +1, +1};
            int[] dc = new int[]{+1, -1, -1, +1};
            int temp = matrix[rtt.row][rtt.col];
            for(int i=0; i<rtt.leng1; i++) {
                matrix[rtt.row + i*dr[0]][rtt.col + i*dc[0]] = matrix[rtt.row + (i+1)*dr[0]][rtt.col + (i+1)*dc[0]];
            }
            int row = rtt.row + rtt.leng1*dr[0], col = rtt.col + rtt.leng1*dc[0];
            for(int i=0; i<rtt.leng2; i++) {
                matrix[row + i*dr[1]][col + i*dc[1]] = matrix[row + (i+1)*dr[1]][col + (i+1)*dc[1]];
            }
            row += rtt.leng2*dr[1];
            col += rtt.leng2*dc[1];
            for(int i=0; i<rtt.leng3; i++) {
                matrix[row + i*dr[2]][col + i*dc[2]] = matrix[row + (i+1)*dr[2]][col + (i+1)*dc[2]];
            }
            row += rtt.leng3*dr[2];
            col += rtt.leng3*dc[2];
            for(int i=0; i<rtt.leng4-1; i++) {
                matrix[row + i*dr[3]][col + i*dc[3]] = matrix[row + (i+1)*dr[3]][col + (i+1)*dc[3]];
            }
            matrix[rtt.row+dr[1]][rtt.col+dc[1]] = temp;
        }
    }

    public static int n;
    public static int[][] matrix;    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        matrix = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Rotation rtt = new Rotation(
            sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
            sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        rotate(rtt);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}