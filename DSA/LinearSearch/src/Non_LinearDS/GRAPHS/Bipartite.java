package Non_LinearDS.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    private boolean chack(int start, int V, ArrayList<ArrayList<Integer>> adj, int color[]){

    Queue<Integer> q = new LinkedList<Integer>();
    q.add(start);
    color[start]=0;
    while ((!q.isEmpty())){
        int node = q.peek();
        q.remove();

        for (int it: adj.get(node)){
            //if adj node is ye not colored
//            you will give the opposite color of the node
            if (color[it] == -1){
                color[it] = 1 - color[node];
                q.add(it);
            }
            //is the adj guy having the same color
            //comeone did color it on some other path
            else if(color[it] == color[node]){
                return false;
            }
        }
    }
    return true;
    }

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj){
        int color[] = new int[V];
        for (int i = 0; i <V ; i++) {
            color[i] = - 1;
        }
        for (int i = 0; i < V; i++) {
            if (color[i] == -1){
                if (check(i, V, adj, color) ==false)){
                    return false;
                }
            }

        }
        return true;
    }
}
