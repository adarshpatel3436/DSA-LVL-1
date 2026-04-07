package RecursionAndBacktracking;

import java.util.Scanner;

public class printEncodings {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str, "");
    }
    public static void printEncodings(String que, String ans){
        if(que.length() == 0){
            System.out.println(ans);
            return;
        } else if (que.length() == 1) {
            char ch = que.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int chv = ch - '0';    // chv = char value
                char code = (char) ('a' + chv - 1);
                ans = ans + code;
                System.out.println(ans);
            }
        }else {
            char ch = que.charAt(0);
            String roq = que.substring(1);

            if(ch=='0'){
                return;
            }else{
                int chv = ch - '0';    // chv = char value
                char code = (char) ('a' + chv - 1);
                printEncodings(roq, ans + code);
            }

            String ch12 = que.substring(0,2);
            String roq12 = que.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                char code = (char) ('a' + ch12v - 1);
                printEncodings(roq12, ans + code);
            }
        }
    }
}
