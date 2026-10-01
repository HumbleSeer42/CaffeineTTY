package self.humbleseer;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
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
        SwingNode sn = new SwingNode();

        TTYEmu term = new TTYEmu();
        term.init(sn, group);

        scene.setFill(Color.BLACK);

        s.setScene(scene);
        s.show();

        s.setOnCloseRequest(event -> {
            System.out.println("Shutting down");
            s.close();
            System.out.println("Terminating...");
            System.exit(0);
        });
    }
}
