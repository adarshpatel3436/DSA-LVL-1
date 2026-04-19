package Array1D;

import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int lb = 0;
        int ub = arr.length - 1;
        int fi = -1;

        while(lb <= ub){
            int mid = (lb + ub) / 2;

            if(data < arr[mid]) {
                ub = mid - 1;

            } else if (data > arr[mid]) {
                lb = mid + 1;

            }else{
                fi = mid;
                ub = mid - 1;

            }
        }
        System.out.println(fi);

        lb = 0;
        ub = arr.length - 1;
        int li = -1;

        while(lb <= ub){
            int mid = (lb + ub) / 2;

            if(data < arr[mid]) {
                ub = mid - 1;

            } else if (data > arr[mid]) {
                lb = mid + 1;

            }else{
                li = mid;
                lb = mid + 1;

            }
        }
        System.out.println(li);
    }
}
