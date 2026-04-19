package Array1D;

import java.sql.Struct;
import java.util.Scanner;

public class rotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
        display(arr);

    }
    public static void display(int[] arr){
        for(int val: arr){
            System.out.println(val);
        }
    }
    public static void rotate(int[] arr, int k){
        // if k is big num
        k = k % arr.length;

        // if k is negative
        if(k < 0) {
            k = k + arr.length;
        }
        // part 1
        reverse(arr, 0, arr.length - k - 1);

        // part 2
        reverse(arr, arr.length - k, arr.length - 1);

        //part 3
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int li, int ri){
        while(li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }

}
