package Array1D;

public class arrayInitialize {
    public static void main(String[] args) {
//        int[] one;
//        one = new int[5];
        // or is tarah kar sakte h

//        int[] one = new int[5];
//        one[0] = 22;
//        one[1] = 55;
//        one[2] = 43;
//        one[3] = 66;
//        one[4] = 77;

//        int[] two = one;
//        two[3] = 234;
//        for (int i = 0; i < one.length; i++) {
//            System.out.println(one[i]);                               // 22 55 43 234 77
//        }

//        for (int i = 0; i < one.length; i++) {
//            System.out.println(two[i]);                             // 22 55 43 234 77    value change ho jayegi kyuki dono ek hi array ko point kar rhe h
//        }

        //        System.out.println(two[3]);                   // 234
//        System.out.println(two.length);




        int[] one = new int[4];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;
        one[3] = 50;

        swap(one,0,3);
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }
     // swaped

    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
