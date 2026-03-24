package Recursion;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class printDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scn.nextInt();
        System.out.print("Decreased number: ");
        decrease(n);

    }
    public static void decrease(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        decrease(n - 1);
    }
}
