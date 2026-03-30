// the following list is the key to character map
// 0 -> .;
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz

package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadCombination {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);

    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};  // global array global ko static se define karte h
    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        //678
        char ch = str.charAt(0);   // 6
        String ros = str.substring(1); // 78
        ArrayList<String> rres = getKPC(ros);  // 6 words of 78

        ArrayList<String> mres = new ArrayList<>();
        String codeForCh = codes[ch - '0'];
        for(int i = 0; i < codeForCh.length(); i++){
            char codech = codeForCh.charAt(i);
            for(String rstr : rres){
                mres.add(codech + rstr);
            }
        }
        return mres;
    }
}
