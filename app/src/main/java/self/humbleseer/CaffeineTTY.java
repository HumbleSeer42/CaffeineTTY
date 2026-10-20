package self.humbleseer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.jediterm.terminal.CursorShape;
import com.jediterm.terminal.ui.JediTermWidget;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;

public class CaffeineTTY {
    JFrame window;
    JediTermWidget terminal;

    CaffeineTTY(String[] args) {
        // Event dispatching and init here
        window = new JFrame();
        window.setTitle("CaffeineTTY");
        window.setSize(500, 500);
        window.setResizable(false);
        window.setDefaultCloseOperation(3);
        terminal = new JediTermWidget(80, 24, new DefaultSettingsProvider());
        terminal.getTerminalPanel().setDefaultCursorShape(CursorShape.BLINK_UNDERLINE);
        window.add(terminal);
    }

    public void show() {
        // Render UI
        window.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule event dispatching thread job
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CaffeineTTY(args).show();
            }
        });
    }
}
