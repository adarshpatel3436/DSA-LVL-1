package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> res = gss(str);
        System.out.println(res);

    }

    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);   // a
        String ros = str.substring(1); // bc  ros- rest of string
        ArrayList<String> rres = gss(ros); // [__, _c, b_, bc]  // rres - recursion result

        ArrayList<String> mres = new ArrayList<>();  // myres
//        for(String rstr : rres){
//            mres.add("" + rstr);
//            mres.add(ch + rstr);
//        }
//        or
        for(String rstr : rres){
            mres.add("" + rstr);
        }
        for(String rstr : rres){
            mres.add(ch + rstr);
        }
                           // res wahi rahega bas order change ho jayega
        return mres;
    }

}
