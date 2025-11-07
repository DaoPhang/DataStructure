package DS.Lab3.q5;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int[4][4];
        System.out.println("Enter a 4x4 integer array: ");

        for(int i = 0; i <4 ; i++){
            for(int j = 0; j<4; j++){
                matrix [i][j] = sc.nextInt();
            }
        }

        int [] result = locateSmallest(matrix);

        System.out.printf("Location: (%d, %d)\n", result[0], result[1]);
    }

    public static int[] locateSmallest(int[][]a){
        int minValue = a[0][0];
        int minRow = 0;
        int minCol = 0;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j<a[i].length;j++){
                if(a[i][j] < minValue){
                    minValue = a[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        return new int[]{minRow, minCol};
    }
}
