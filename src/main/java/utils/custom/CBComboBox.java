package utils.custom;

import javax.swing.JComboBox;
import utils.Constants;

public class CBComboBox extends JComboBox implements Constants {

    public CBComboBox() {
        initComponents();
    }

    private void initComponents() {
        setBackground(COLOR_BACKGROUND_DARK);
        setFont(FONT_DEFAULT);
        setForeground(COLOR_FONT_LIGHT);
        setBorder(null);
        setFocusable(false);
    }

}
