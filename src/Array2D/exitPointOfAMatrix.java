package Array2D;

import java.util.Scanner;

public class exitPointOfAMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        // 0 & 1 only
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int i = 0;  // starting 0 0 idx
        int j = 0;
        int dir = 0;   // 0 - east, 1 - south, 2- west, 3 - north

        while (true){
            dir = (dir + arr[i][j]) % 4;  // if dir is bigger than 3 so by % 4 its again come in 0......

            if(dir == 0){
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if(i < 0){
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);
    }
}
