import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by chrx on 10/25/17.
 */
public class TestBlock extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane1 = new StackPane();
        Rectangle block = new Rectangle(100, 100);
        pane1.getChildren().add(block);

        Block b1 = new Block(false);
        Block b2 = new Block(false);
        Block b3 = new Block(false);
        Block b4 = new Block(false);
        Block b5 = new Block(true);
        Block b6 = new Block(false);
        Block b7 = new Block(false);
        Block b8 = new Block(false);
        Block b9 = new Block(true);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        pane.add(b1, 0, 0);
        pane.add(b2, 1, 0);
        pane.add(b3, 2, 0);
        pane.add(b4, 0, 1);
        pane.add(b5, 1, 1);
        pane.add(b6, 2, 1);
        pane.add(b7, 0, 2);
        pane.add(b8, 1, 2);
        pane.add(b9, 2, 2);

        Scene scene = new Scene(pane, 100, 100);
        primaryStage.setTitle("TestBlock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
