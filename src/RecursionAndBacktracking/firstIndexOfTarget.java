package RecursionAndBacktracking;

import java.util.Scanner;

public class firstIndexOfTarget {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int fi = firstIndex(arr, 0, target);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int target){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == target){
            return idx;
        }else{
            int fiisa = firstIndex(arr, idx + 1, target);  // fiisa = first index in smaller array
            return fiisa;
        }
    }

}
