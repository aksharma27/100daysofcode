package Non_LinearDS.GRAPHS;

import java.util.ArrayList;

public class AdjList {
    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        //add n + 1 arraylist
        for (int i = 0; i <= n; i++){
            adj.add(new ArrayList<Integer>());
        }

        //edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2---3
        adj.get(2).add(3);
        adj.get(3).add(2);

//        edge 1---3
        adj.get(1).add(3);
        adj.get(3).add(1);

//        print all the edges connected
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.println(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
