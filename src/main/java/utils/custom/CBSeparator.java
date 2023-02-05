package utils.custom;

import java.awt.Dimension;
import javax.swing.JSeparator;
import static utils.Constants.COLOR_BUTTON_HIGH;

public class CBSeparator extends JSeparator {

    public CBSeparator(int width) {
        initComponents(width);
    }

    private void initComponents(int width) {
        setBackground(COLOR_BUTTON_HIGH);
        setPreferredSize(new Dimension(width, 1));
        setForeground(COLOR_BUTTON_HIGH);
    }
}
