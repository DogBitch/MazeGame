import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by chrx on 10/25/17.
 */
public class Player extends Pane {
    private Rectangle block = new Rectangle(40, 40);
    private Rectangle face = new Rectangle(8, 8);
    private Directions dir;
    private int x;
    private int y;

    public Player(){
        dir = Directions.NORTH;
        updateBlock();
    }

    public void updateBlock(){
        getChildren().clear();

        block.setFill(Color.RED);
        face.setFill(Color.YELLOW);
        switch (dir){
            case EAST:
                face.setX(block.getX() + (block.getWidth() - face.getWidth()));
                face.setY(block.getY() + (block.getHeight()/2 - face.getHeight()/2));
                break;
            case WEST:
                face.setX(block.getX());
                face.setY(block.getY() + (block.getHeight()/2 - face.getHeight()/2));
                break;
            case NORTH:
                face.setX(block.getX() + (block.getWidth()/2 - face.getWidth()/2));
                face.setY(block.getY());
                break;
            case SOUTH:
                face.setX(block.getX() + (block.getWidth()/2 - face.getWidth()/2));
                face.setY(block.getY() + (block.getHeight() - face.getHeight()));
                break;
        }



        getChildren().addAll(block, face);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Directions getDir(){
        return dir;
    }

    public void setDir(Directions dir){
        this.dir = dir;
        updateBlock();
    }

    public void turnLeft(){
        switch (dir){
            case EAST:
                dir = Directions.NORTH;
                break;
            case WEST:
                dir = Directions.SOUTH;
                break;
            case NORTH:
                dir = Directions.WEST;
                break;
            case SOUTH:
                dir = Directions.EAST;
                break;
        }
        updateBlock();
    }

    public void turnRight(){
        switch (dir){
            case EAST:
                dir = Directions.SOUTH;
                break;
            case WEST:
                dir = Directions.NORTH;
                break;
            case NORTH:
                dir = Directions.EAST;
                break;
            case SOUTH:
                dir = Directions.WEST;
                break;
        }
        updateBlock();
    }
}

enum Directions{EAST, WEST, NORTH, SOUTH}
