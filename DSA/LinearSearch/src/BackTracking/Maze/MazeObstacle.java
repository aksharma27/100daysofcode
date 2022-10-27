package BackTracking.Maze;

public class MazeObstacle {
    static void mazeRestricted(String p, boolean[][] maze, int r, int c){
        if (r== maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){       //or maze[r][c] == false: return;
            return;
        }

        if (r < maze.length - 1){
            mazeRestricted(p + 'D', maze, r+1 , c);
        }

        if (c < maze[0].length - 1){
            mazeRestricted(p + 'R', maze, r, c+1);
        }
    }

    public static void main(String[] args) {
        boolean[][] board ={
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazeRestricted("", board, 0, 0);
    }
}
