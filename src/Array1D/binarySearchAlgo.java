package Array1D;

public class binarySearchAlgo {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int data = 30;

        int lb = 0;
        int ub = arr.length - 1;

        while(lb <= ub){
            int mid = lb + ub / 2;

            if(arr[mid] < data){
                ub = mid - 1;
            } else if (arr[mid] > data) {
                lb = mid + 1;
            }else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
