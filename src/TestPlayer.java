import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by chrx on 10/25/17.
 */
public class TestPlayer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //StackPane pane = new StackPane();
        Player player = new Player();

        //pane.getChildren().add(player);

        player.widthProperty().addListener(ov -> player.updateBlock());
        player.widthProperty().addListener(ov -> player.updateBlock());

        player.setOnKeyPressed(e -> {
            switch (e.getCode()){
                case UP:
                    player.setDir(Directions.NORTH);
                    break;
                case DOWN:
                    player.setDir(Directions.SOUTH);
                    break;
                case LEFT:
                    player.turnLeft();
                    break;
                case RIGHT:
                    player.turnRight();
                    break;
            }
        });

        Scene scene = new Scene(player, 80, 80);
        primaryStage.setTitle("TestPlayer");
        primaryStage.setScene(scene);
        primaryStage.show();

        player.requestFocus();
    }
}
