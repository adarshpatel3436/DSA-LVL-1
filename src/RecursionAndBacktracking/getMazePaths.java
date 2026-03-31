package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class getMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }
     // sr - source row
     // sc - source column
     // dr - destination row
     // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> Bpaths = new ArrayList<>();
            Bpaths.add("");
            return Bpaths;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sr < dr){
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }
        if(sc < dc){
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for(String hpath : hpaths){
            paths.add("h" + hpath);
        }
        for(String vpath : vpaths){
            paths.add("v" + vpath);
        }
        return paths;
    }
}
