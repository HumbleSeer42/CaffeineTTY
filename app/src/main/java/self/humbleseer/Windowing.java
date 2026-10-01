package self.humbleseer;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Windowing {
    public static Stage createWindow(String title, int width, int height) {
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setWidth(width);
        stage.setHeight(height);

        return stage;
    }

    public static Scene createScene(Group group, Stage stage) {
        Scene scene = new Scene(group, stage.getWidth(), stage.getHeight());

        return scene;
    }

    public static Group createGroup() {
        Group root = new Group();

        return root;
    }
}
