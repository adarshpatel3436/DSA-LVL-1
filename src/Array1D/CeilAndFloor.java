package Array1D;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();

        int lb = 0;
        int ub = arr.length - 1;
        int ceil = 0;
        int floor = 0;

        while(lb <= ub){
            int mid = (lb + ub) / 2;

            if(data < arr[mid]) {
                ub = mid - 1;
                ceil = arr[mid];
            } else if (data > arr[mid]) {
                lb = mid + 1;
                floor = arr[mid];
            }else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println(floor);
        System.out.println(ceil);
    }
}
