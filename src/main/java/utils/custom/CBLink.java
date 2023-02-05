package utils.custom;

import java.awt.Font;
import javax.swing.JLabel;
import utils.Constants;

public class CBLink extends JLabel implements Constants {

    private Font font;

    public CBLink(String text) {
        initComponents(text);
    }

    private void initComponents(String text) {
        setForeground(COLOR_FONT_LIGHT);
        font = FONT_DEFAULT;
        setFont(font);
        setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        setText(text);
    }

}
