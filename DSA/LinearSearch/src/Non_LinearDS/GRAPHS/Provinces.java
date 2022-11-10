package Non_LinearDS.GRAPHS;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Provinces {
    static int numprovinces(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V ; i++) {
            adjLs.add(new ArrayList<Integer>());
        }

        //to change adjacency matrix to list
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j){      //there should be a node and the nodes should not be self nodes(i != j)
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int vis[] = new int[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0){
               count++;
               dfs(i, adjLs, vis);      //i = start node, adjlist and visited array
            }
        }
        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int vis[]){
        vis[node] = 1;
        for (Integer it : adjLs.get(node) ){
            if (vis[it] == 0){
                dfs(it, adjLs, vis);
            }
        }
    }
}
