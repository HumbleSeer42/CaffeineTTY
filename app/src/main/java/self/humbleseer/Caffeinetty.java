package self.humbleseer;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;

public class Caffeinetty extends Application {
  @Override
  public void start(Stage stage) {
    Text first_line = new Text(10, 20, "This is a test.");
    first_line.setFont(new Font(12));
    first_line.setFill(Color.RED);
    Text second_line = new Text(10, 40, "This is a second line of text");
    second_line.setFont(new Font(12));
    second_line.setFill(Color.BLUE);

    TextField myFirstField = new TextField();
    myFirstField.setMinWidth(500);
    myFirstField.setMinHeight(500);
    myFirstField.setMaxSize(500, 500);
    myFirstField.setAlignment(Pos.TOP_LEFT);

    Group root = new Group(first_line, second_line, myFirstField);
    Scene scene = new Scene(root, 500, 500);

    stage.setTitle("CaffeineTTY");
    stage.setScene(scene);
    stage.show();
  }
}
