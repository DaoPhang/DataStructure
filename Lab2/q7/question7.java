package DS.Lab2.q7;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] m = new double [3][3];

        System.out.println("Enter a 3-by-3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        if (isMarkovMatrix(m)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is NOT a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][]m){
        for(int i = 0; i<3 ; i++){
            for(int j = 0; j<3; j++){
                if(m[i][j]<0){
                    return false;
                }
            }
        }
        

        for (int col = 0; col < 3; col++) {
            double sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += m[row][col];
            }

            if (Math.abs(sum - 1) > 1e-9) {
                return false;
            }
        }

        return true;
    }
}

