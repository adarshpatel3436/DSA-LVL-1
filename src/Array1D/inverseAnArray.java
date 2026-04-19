package Array1D;

import java.util.Scanner;

public class inverseAnArray {

    public static void display(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int val : arr){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            inv[v] = i;
        }
        return inv;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = inverse(arr);
        display(res);
    }

}
