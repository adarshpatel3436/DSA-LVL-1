package RecursionAndBacktracking;

import java.util.Scanner;

public class printPermutations {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str, "");
    }
    public static void printPermutations(String que, String ans) {
        if(que.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < que.length(); i++){
            char ch = que.charAt(i);
            String qlpart = que.substring(0, i);                 // que. left part
            String qrpart = que.substring(i + 1);
            String roq = qlpart + qrpart;

            printPermutations(roq, ans + ch);
        }
    }
}
