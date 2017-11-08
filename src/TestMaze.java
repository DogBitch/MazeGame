import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by chrx on 10/25/17.
 */
public class TestMaze extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        int[][] map = new int[][] {
                {1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        Maze maze = new Maze(map);
        maze.setAlignment(Pos.CENTER);

        maze.addPlayer(2, 0, Directions.SOUTH);

        //maze.addPlayer(2, 1, Directions.SOUTH);

        Scene scene = new Scene(maze);
        primaryStage.setTitle("TestMaze");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
