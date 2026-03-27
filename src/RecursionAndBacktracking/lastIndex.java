package RecursionAndBacktracking;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int li = lastIndex(arr, 0, target);
        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int target){
        if(idx == arr.length){
            return -1;
        }
        int liisa = lastIndex(arr, idx + 1, target); // liisa = last index in smaller array

        if(liisa == -1) {
            if (arr[idx] == target) {
                return idx;

            } else {
                return -1;
            }
        }else{
            return liisa;
        }

    }
}
