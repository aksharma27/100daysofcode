package Non_LinearDS.GRAPHS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfsOfGraphs(int V, ArrayList<ArrayList<Integer>> adj){ //V = nodes/vertices.  adj = adj list(given)
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue <Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);              //whichever node gets out, that is added in the bfs

            //check the neighbours: get all the adj nodes
            for (Integer it: adj.get(node)){
                if (vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
