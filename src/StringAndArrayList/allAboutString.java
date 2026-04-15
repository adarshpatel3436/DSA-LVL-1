package StringAndArrayList;

import java.util.Scanner;

public class allAboutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s1 = "hello";
        //String s1 = sc.next();   // abc def  -- abc
        //String s = sc.nextLine();  // abc def -- abc def

//        System.out.println(s);
//        System.out.println(s.length());
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            System.out.println(ch);
//        }
       // s.charAt(0) = 'x';   // won't work

//        String s = "abcd";
//        System.out.println(s.substring(0,1));  //(0,0) -- __   //(3,1) -- error
//        System.out.println(s.substring(2));  // 2-end

//        String s1 = "hello";
//        s1 += ' ';     // '' -- char
//        s1 += 'w';

//        String s2 = "World!";
//        String s3 = s1 + " " + s2;
//        System.out.println(s3);
//        System.out.println(s1);

//        System.out.println("Hello" + 10 + 20 );  // Hello1020 -- left to right so first print string hello10 the +20 also convert in str so hello1020
//        System.out.println(10 + 20 + "hello");  // 30hello

//        String s = "abc def ghi jkl";
//        String[] parts = s.split(" ");

        String s = "abc,def,ghi,jkl mno";
        String[] parts = s.split(",");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}

// you can't change the value of char