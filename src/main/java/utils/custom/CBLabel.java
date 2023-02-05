package utils.custom;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import utils.Constants;

public class CBLabel extends JLabel implements Constants {

    public CBLabel(String text, Color color, Font style) {
        initComponents(text, color, style);
    }

    private void initComponents(String text, Color fontColor, Font fontStyle) {
        setForeground(COLOR_FONT_LIGHT);
        setFont(fontStyle);
        setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        setText(text);
    }
}
