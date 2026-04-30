package TimeAndSpace;

import java.util.Scanner;

public class PartioningAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter pivot: ");
        int p = sc.nextInt();

        partition(arr, p);
        display(arr);

    }

    public static void partition(int[] arr, int pivot){
        int i = 0;
        int j = 0;

        while( i < arr.length){
            if(arr[i] > pivot){
                i++;
            }else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
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
}
