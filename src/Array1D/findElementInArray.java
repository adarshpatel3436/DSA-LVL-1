package Array1D;

import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:  ");
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
