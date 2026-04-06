package RecursionAndBacktracking;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class printSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSS(str, "");

    }
    public static void printSS(String que, String ans){
     if(que.length() == 0){
         System.out.println(ans);
         return;
     }
     char ch = que.charAt(0);
     String roq = que.substring(1);

     printSS(roq, ans+ch);
     printSS(roq, ans + "");

    }
}
