package shapeCalc;

import javax.swing.*;
@SuppressWarnings("serial")
public abstract class AFrame extends JFrame {

    public AFrame(String title) {
        super(title);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        initialize();
    }
    protected abstract void initialize();
}