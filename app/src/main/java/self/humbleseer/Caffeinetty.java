package self.humbleseer;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Caffeinetty extends Application {
    @Override
    public void start(Stage stage) {
        Stage s = Windowing.createWindow("CaffeineTTY", 500, 500);
        Group group = new Group();
        Scene scene = Windowing.createScene(group, s);
        scene.setFill(Color.BLACK);

        s.setScene(scene);
        s.show();
    }
}
