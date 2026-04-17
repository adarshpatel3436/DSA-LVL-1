package Array1D;

public class arrayInitialize {
    public static void main(String[] args) {
//        int[] one;
//        one = new int[5];
        int[] one = new int[5];
        one[0] = 22;
        one[1] = 55;
        one[2] = 43;
        one[3] = 66;
        one[4] = 77;

//        int[] two = one;
//        two[3] = 234;
        swap(one,0,4);
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }
//        System.out.println(two[3]);
//        System.out.println(two.length);

    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
