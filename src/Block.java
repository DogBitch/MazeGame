import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by chrx on 10/25/17.
 */
public class Block extends Pane {
    private Rectangle block = new Rectangle(40, 40);
    private boolean open;

    public Block(){}

    public Block(boolean open){
        this.open = open;
        paintBlock();
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void paintBlock(){
        if (open){
            block.setFill(Color.WHITE);
        }
        getChildren().clear();
        getChildren().add(block);
    }
}
