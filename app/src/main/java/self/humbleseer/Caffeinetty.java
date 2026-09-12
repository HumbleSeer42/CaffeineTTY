package self.humbleseer;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import com.jediterm.terminal.ui.JediTermWidget;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;
import javafx.embed.swing.SwingNode;
import javax.swing.SwingUtilities;

public class Caffeinetty extends Application {
  @Override
  public void start(Stage stage) {
    /*
     * TextField myFirstField = new TextField();
     * myFirstField.setMinWidth(500);
     * myFirstField.setMinHeight(500);
     * myFirstField.setMaxSize(500, 500);
     * myFirstField.setAlignment(Pos.TOP_LEFT);
     * myFirstField.setOnAction(event -> {
     * System.out.println(myFirstField.getText());
     * myFirstField.clear();
     * });
     */

    SwingNode terminalContainer = new SwingNode();
    BorderPane root = new BorderPane();
    root.setCenter(terminalContainer);

    Scene scene = new Scene(root, 500, 500);

    stage.setTitle("CaffeineTTY");
    stage.setScene(scene);
    stage.setResizable(false);
    stage.show();

    SwingUtilities.invokeLater(() -> {
      JediTermWidget term = new JediTermWidget(
          80,
          14,
          new DefaultSettingsProvider());

      terminalContainer.setContent(term);
    });
  }
}
