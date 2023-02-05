package utils.custom;

import java.awt.Dimension;
import javax.swing.JPasswordField;
import utils.Constants;

public class CBPasswordField extends JPasswordField implements Constants {

    public CBPasswordField(int width, int height) {
        initComponents(width, height);

    }

    private void initComponents(int width, int height) {
        setBackground(COLOR_BACKGROUND_DARK);
        setPreferredSize(new Dimension(width, height));
        setForeground(COLOR_FONT_LIGHT);
        setText("");
        setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 45, 62), 8)));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setCaretColor(COLOR_BUTTON_HIGH);
        setSelectionColor(COLOR_BUTTON_HIGH);
        setSelectedTextColor(COLOR_FONT_LIGHT);
    }

    @Override
    public String getText() {
        return this.getText();
    }
}
