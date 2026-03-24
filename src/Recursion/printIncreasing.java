package Recursion;

import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scn.nextInt();
        System.out.print("Increased number: ");
        increase(n);

    }
    public static void increase(int n){
        if(n == 50){
            return ;
        }
        System.out.println(n);
        increase(n + 1);
    }
}
