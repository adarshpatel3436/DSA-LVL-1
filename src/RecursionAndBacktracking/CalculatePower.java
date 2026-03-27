package RecursionAndBacktracking;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int xn = power(x , n);
        System.out.println(xn);
    }
    public static int power (int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x , n-1);
        int xn = x * xnm1;
        return xn;
    }
}
