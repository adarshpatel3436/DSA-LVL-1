package Array2D;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First matrix input: ");
        System.out.print("Enter row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter column: ");
        int c1 = sc.nextInt();

        int[][] m1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second matrix input: ");
        System.out.print("Enter row: ");
        int r2 = sc.nextInt();
        System.out.print("Enter column: ");
        int c2 = sc.nextInt();

        int[][] m2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        if(c1 != r2){
            System.out.println("Invalid Input");
            return;
        }

        int[][] prd = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prd[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // display

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }

    }
}
