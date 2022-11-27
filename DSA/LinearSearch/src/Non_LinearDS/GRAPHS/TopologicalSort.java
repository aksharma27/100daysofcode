package Non_LinearDS.GRAPHS;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort {
    int V;
    ArrayList<ArrayList<Integer>> adj;
    TopologicalSort(int v){
        V = v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; ++i) {
                adj.add(new ArrayList<Integer>());
        }
    }

    //add an edge into the graph
    void addEdge(int v, int w){
        adj.get(v).add(w);
    }

    //recursive function used by topological sort
    void topologicalSortUtil(int v, boolean vis[], Stack<Integer> stack){
        //mark the current node as visited
        vis[v] = true;
        Integer i;

        //recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()){
            i = it.next();
            if (!vis[v])
                topologicalSortUtil(i, vis, stack);
        }
    }

    //push current vertex to stack which stress result it uses recursive topologicalSortUtil()
    void topologicalSort(){
        Stack<Integer> stack = new Stack<Integer>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            vis[i] = false;
        }
            //call the recursive helper function to store topologicalSort starting from all vertices one by one
            for (int j = 0; j <V ; j++) {
                if (vis[j]==false )
                    topologicalSortUtil(j, vis, stack);

            }

            //now print content of stack:
        while(!stack.empty())
        {
            System.out.println(stack.pop() + " ");
        }


    }

    public static void main(String[] args) {
       TopologicalSort g = new TopologicalSort(6);
       g.addEdge(5,2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println("T sort : ");
        g.topologicalSort();
    }
}
