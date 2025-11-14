package DS.Lab2.q6;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] a = new double[2][2];
        double[][] b = new double[2][2];

        System.out.println("Enter matrix A (2x2): ");
        for(int i = 0; i<2; i++){
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter matrix B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextDouble();
            }
        }

        double[][] addition = addMatrix(a, b);
        double[][] subtraction = subMatrix(a, b);

        System.out.println("The addition of the two matrix results in: ");
        for(int i = 0; i<2; i++){
            for(int j = 0;j <2; j++){
                System.out.printf("%.1f ", addition[i][j]);
            }
            System.out.println();
        }

        System.out.println("The subtraction of the two matrix results in: ");
        for(int i = 0; i<2; i++){
            for(int j = 0;j <2; j++){
                System.out.printf("%.1f ", subtraction[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][]a, double[][]b){
        double[][] c = new double[a.length][b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static double [][] subMatrix(double[][]a, double[][]b){
        double[][] d = new double [a.length][b.length];

        for(int i = 0; i< a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                d[i][j]= a[i][j] - b[i][j];
            }
        }
        return d;
    }
}