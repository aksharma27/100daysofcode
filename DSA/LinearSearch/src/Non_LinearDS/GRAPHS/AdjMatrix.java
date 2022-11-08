package Non_LinearDS.GRAPHS;

public class AdjMatrix {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int adj[][] = new int[n][m];

//        edge 1---2  and edge 2---1
        adj[1][2] = 1;
        adj[2][1] = 1;

//        edge 2---3  and edge 3---2
        adj[2][3] = 1;
        adj[3][2] = 1;

//        edge 1---3  and edge 3---1
        adj[1][3] = 1;
        adj[3][1] = 1;
    }
}
