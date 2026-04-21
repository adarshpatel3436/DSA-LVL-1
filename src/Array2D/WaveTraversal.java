package Array2D;

import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix input: ");
        System.out.print("Enter row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter column: ");
        int c1 = sc.nextInt();

        int[][] arr = new int[r1][c1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // wave display
        for (int j = 0; j < arr[0].length; j++) {
            if(j % 2 == 0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }else{
                for (int i = arr.length - 1; i >= 0 ; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
