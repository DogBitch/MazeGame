import javafx.scene.layout.GridPane;

/**
 * Created by chrx on 10/23/17.
 */
public class Maze extends GridPane {
    private int[][] maze;
    private Block[][] blocks;
    private Player player = new Player();

    public Maze(int[][] maze){
        this.maze = maze;
        blocks = new Block[maze.length][maze[0].length];
        readArray();
    }

    private void readArray(){
        for(int w = 0; w < maze.length; w++){
            for (int h = 0; h < maze[w].length; h++){
                switch (maze[h][w]){
                    case 0:
                        blocks[h][w] = new Block(true);
                        break;
                    case 1:
                        blocks[h][w] = new Block(false);
                        break;
                }
            }
        }
    }

    public void paintMaze(){
        getChildren().clear();
        for(int w = 0; w < blocks.length; w++){
            for (int h = 0; h < blocks[w].length; h++){
                add(blocks[h][w], w, h);
            }
        }
    }

    public void addPlayer(int x, int y, Directions dir){
        //getChildren().remove(player);
        player.setX(x);
        player.setY(y);
        player.setDir(dir);
        add(player, x, y);
        paintMaze();
    }

    public void takeStep(){
        Block inFront = new Block();
        switch (player.getDir()){
            case NORTH:
                inFront = blocks[player.getX()][player.getY() - 1];
                break;
            case SOUTH:
                inFront = blocks[player.getX()][player.getY() + 1];
                break;
            case EAST:
                inFront = blocks[player.getX() + 1][player.getY()];
                break;
            case WEST:
                inFront = blocks[player.getX() - 1][player.getY()];
                break;
        }

        if (inFront.isOpen()){
            getChildren().remove(player);
            player.setX(player.getX());
            player.setX(player.getY() - 1);
        }

        addPlayer(player.getX(), player.getY(), player.getDir());
    }
}
