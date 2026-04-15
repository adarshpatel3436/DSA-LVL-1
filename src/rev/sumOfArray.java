package rev;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sumArray(arr, 0);
        System.out.println(sum);
    }

    public static int sumArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        return arr[idx] + sumArray(arr, idx + 1);
    }
}
