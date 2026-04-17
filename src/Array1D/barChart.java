package Array1D;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int floar = max ; floar >= 1; floar--){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= floar){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
