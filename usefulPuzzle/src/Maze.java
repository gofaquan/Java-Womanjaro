public class Maze<T> {
    public static void main(String[] args) {
        //create a maze ,
        int[][] maze = new int[8][17];
        //create barrier; 0 = road ,1 = barrier

        //row 1 and last row => 1
        for (int i=0; i< maze[0].length-1;i++){
            maze[0][i] = 1;
            maze[maze.length-1][i] = 1;
        }


        //column 1 and last column => 1
        for (int i=0;i< maze.length;i++){
            maze[i][0] = 1;
            maze[i][maze[i].length-1] = 1;
        }

        //11111111111111111
        //10000000000000001
        //10000000000000001
        //10000000000000001
        //10000000000000001
        //10000000000000001
        //10000000000000001
        //11111111111111111

        //print maze
        for (int i=0; i<maze.length; i++){
            for (int j=0; j<maze[i].length;j++){
                System.out.print(maze[i][j]);
            }

            System.out.println();
        }
        System.out.println("----------------------------------------------");
        //find way
        Path path = new Path();
        path.findWay(maze,1,1);

        //print maze that has a route to the final
        for (int i=0; i<maze.length; i++){
            for (int j=0; j<maze[i].length;j++){
                System.out.print(maze[i][j]);
            }

            System.out.println();
        }
    }
}

class Path {
    //if find way successfully, return true, else false;
    //i,j is the position of our object
    //0 unknown zone but can go ahead ;1 barrier;  2表示可以走，3表示走过，但是走不通
    //according the maze,move down is in privilege and then is right up left
    public boolean findWay(int[][] maze,int i ,int j){
        if (maze[maze.length-2][maze[0].length-2] == 2){
            return true;
        }else {
            if (maze[i][j] == 0) {
                        //we suppose it can be go out
                        maze[i][j] = 2;
                        //move down
                        if (findWay(maze, i + 1, j)) {
                            return true;
                        } else if (findWay(maze, i, j + 1)) {//move right
                            return true;
                        } else if (findWay(maze, i - 1, j)) {//move up
                            return true;
                        } else if (findWay(maze, i, j - 1)) {//move left
                            return true;
                        } else {
                            maze[i][j] = 3;
                            return false;
                        }
                }else {
                return false;
            }
        }
    }
}
