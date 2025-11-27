public class path_with_obstacles {

    public static void path_restrictions(String p,boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);

            return;
        }
        if(!maze[r][c]){
            return;}
        if (r<maze.length-1) {
            path_restrictions(p + 'D',maze, r + 1, c );
        }
        if (c<maze[0].length-1) {
            path_restrictions(p + 'R', maze,r , c+1);
        }

    }
        public static void main(String[] args){
            boolean board[][]={
                    {true,true,true},
                    {true,false,true},
                    {true,true,true}
            };
            path_restrictions("",board,0,0);

        }
    }


