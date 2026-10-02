package self.humbleseer;

import javax.swing.SwingUtilities;

import com.jediterm.terminal.ui.JediTermWidget;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;

import javafx.embed.swing.SwingNode;
import javafx.scene.Group;

public class TTYEmu {
    public void init(SwingNode swingNode, Group g) {
        JediTermWidget jtw = new JediTermWidget(60, 24, new DefaultSettingsProvider());

        SwingUtilities.invokeLater(() -> {
            swingNode.setContent(jtw);
        });

        g.getChildren().add(swingNode);
    }
}
