package TimeAndSpace;

import java.util.Scanner;

public class QuickSelect {
    public static int quickSelect(int[] arr, int lo, int hi, int k){
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);

        if(k > pi){
            return quickSelect(arr, pi + 1, hi, k);
        } else if (k < pi) {
            return quickSelect(arr, lo, pi - 1, k);
        } else {
            return arr[pi];
        }
    }

    public static int partition(int[] arr, int pivot, int lo, int hi){
        System.out.println("pivot -> " + pivot);
        int i = lo , j = lo;

        while(i <= hi){
            if(arr[i] <= pivot){
                swap(arr, i, j);
                i++;
                j++;
            }else {
                i++;
            }
        }
        System.out.println("pivot index : " + (j-1));
        return (j-1);
    }

    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping "+ arr[i]+ " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("kth elelment: ");
        int k = sc.nextInt();
        quickSelect(arr, 0, arr.length - 1, k - 1);
        display(arr);
    }
}
