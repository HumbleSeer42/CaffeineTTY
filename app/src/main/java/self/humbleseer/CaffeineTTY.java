package self.humbleseer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CaffeineTTY {
    JFrame window;

    CaffeineTTY(String[] args) {
        // Event dispatching and init here
        window = new JFrame();
        window.setTitle("CaffeineTTY");
        window.setSize(500, 500);
        window.setDefaultCloseOperation(3);
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
