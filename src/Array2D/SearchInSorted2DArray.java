package Array2D;

import java.util.Scanner;

public class SearchInSorted2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        
        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j >= 0){
            if (data == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (data < arr[i][j]) {
                j--;
            } else if (data > arr[i][j]) {
                i++;
            }
        }
        System.out.println("data not found");
    }
}
