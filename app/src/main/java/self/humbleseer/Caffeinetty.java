package self.humbleseer;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Caffeinetty extends Application {
  @Override
  public void start(Stage stage) {
    Group root = new Group();
    Scene scene = new Scene(root, 500, 500);

    stage.setTitle("CaffeineTTY");
    stage.setScene(scene);
    stage.show();
  }
}
