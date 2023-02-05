package utils.custom;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class CBVoidPanel extends JPanel {

    public CBVoidPanel(int width, int height, Color color) {
        initComponents(width, height, color);
    }

    private void initComponents(int width, int height, Color color) {
        setPreferredSize(new Dimension(width, height));
        setBackground(color);

    }
}
