import java.util.*;

public class Main {
    public static int[][] matrix;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        matrix = new int[4][4];

        for(int i=0; i<4; i++)
            for(int j=0; j<4; j++)
                matrix[i][j] = sc.nextInt();

        char cmd = sc.next().charAt(0);

        if(cmd == 'R') {
            for(int i=0; i<4; i++) {
                for(int j=4-1; j>0; j--) {
                    if(matrix[i][j] == 0) {
                        for(int k=j-1; k>=0; k--) {
                            if(matrix[i][k] != 0) {
                                matrix[i][j] = matrix[i][k];
                                matrix[i][k] = 0;
                            }
                        }
                    }
                }
                for(int j=3; j>0; j--) {
                    if(matrix[i][j] == matrix[i][j-1]) {
                        matrix[i][j] *= 2;
                        matrix[i][j-1] = 0;
                        j--;
                    }
                }
                for(int j=4-1; j>0; j--) {
                    if(matrix[i][j] == 0) {
                        for(int k=j-1; k>=0; k--) {
                            if(matrix[i][k] != 0) {
                                matrix[i][j] = matrix[i][k];
                                matrix[i][k] = 0;
                            }
                        }
                    }
                }
            }
        } else if(cmd == 'L') {
            for(int i=0; i<4; i++) {
                for(int j=0; j<3; j++) {
                    if(matrix[i][j] == 0) {
                        matrix[i][j] = matrix[i][j+1];
                        matrix[i][j+1] = 0;
                    }
                }
                for(int j=0; j<3; j++) {
                    if(matrix[i][j] == matrix[i][j+1]) {
                        matrix[i][j] *= 2;
                        matrix[i][j+1] = 0;
                        j++;
                    }
                }
                for(int j=0; j<3; j++) {
                    if(matrix[i][j] == 0) {
                        matrix[i][j] = matrix[i][j+1];
                        matrix[i][j+1] = 0;
                    }
                }
            }
        } else if(cmd == 'U') {
            for(int j=0; j<4; j++) {
                for(int i=0; i<3; i++) {
                    if(matrix[i][j] == 0) {
                        matrix[i][j] = matrix[i+1][j];
                        matrix[i+1][j] = 0;
                    }
                }
                for(int i=0; i<3; i++) {
                    if(matrix[i][j] == matrix[i+1][j]) {
                        matrix[i][j] *= 2;
                        matrix[i+1][j] = 0;
                        i++;
                    }
                }
                for(int i=0; i<3; i++) {
                    if(matrix[i][j] == 0) {
                        matrix[i][j] = matrix[i+1][j];
                        matrix[i+1][j] = 0;
                    }
                }
            }
        } else {
            for(int j=0; j<4; j++) {
                for(int i=3; i>0; i--) {
                    if(matrix[i][j] == 0) {
                        matrix[i][j] = matrix[i-1][j];
                        matrix[i-1][j] = 0;
                    }
                }
                for(int i=3; i>0; i--) {
                    if(matrix[i][j] == matrix[i-1][j]) {
                        matrix[i][j] *= 2;
                        matrix[i-1][j] = 0;
                        i--;
                    }
                }
                for(int i=3; i>0; i--) {
                    if(matrix[i][j] == 0) {
                        matrix[i][j] = matrix[i-1][j];
                        matrix[i-1][j] = 0;
                    }
                }
            }
        }
        
        
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}