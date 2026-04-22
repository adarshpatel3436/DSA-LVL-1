package Array2D;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int tne = n * m;   // total number of element
        int count = 0;

        while(count < tne){
            for (int i = minr , j = minc ; i <= maxr && count < tne; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            for (int i = maxr , j = minc ; j <= maxc && count < tne; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            for (int i = maxr , j = maxc ; i >= minr && count < tne; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            for (int i = minr , j = maxc ; j >= minc && count < tne; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}
