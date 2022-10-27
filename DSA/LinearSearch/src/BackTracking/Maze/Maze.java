package BackTracking.Maze;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    static int count(int r, int c){
        if (r==1 || c==1)       //base condition
            return 1;

        int left = count(r-1, c);       //int the left tree, going down by 1
        int right = count(r, c-1);      //in the right tree, going right => col - 1

        //total ans = right + left
        return left + right;
    }


    //Q2) print the total paths through which we can reach the end:
    static ArrayList<String> paths(String p, int r, int c){
        //base condition: when both r and c is 1, we have got the ans
        if (r == 1 && c == 1){      //base
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1){     //going down = r-1
            list.addAll(paths(p + 'D', r - 1, c));
        }
        if (c > 1){
            list.addAll(paths(p + 'R', r, c - 1));
        }

        return list;
    }

    //include diagonal paths:
    static ArrayList<String> pathsDiag(String p, int r, int c){
        //base condition: when both r and c is 1, we have got the ans
        if (r == 1 && c == 1){      //base
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1){     //going down = r-1
            list.addAll(pathsDiag(p + 'D', r - 1, c));
        }
        if (c > 1){
            list.addAll(pathsDiag(p + 'R', r, c - 1));
        }
        if (r > 1 && c > 1){    //condition for diagonal
            list.addAll(pathsDiag(p + "diag", r -1, c - 1));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(count(3,3));     //maze of 3 rows and 3 cols
//        paths("", 3, 3);
        System.out.println(paths("",3,3));
        System.out.println(pathsDiag("", 3,3));
    }
}
