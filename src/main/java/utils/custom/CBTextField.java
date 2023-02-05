package utils.custom;

import java.awt.Dimension;
import javax.swing.JTextField;
import utils.Constants;

public class CBTextField extends JTextField implements Constants {

    public CBTextField(int width, int height) {
        initComponents(width, height);
    }

    private void initComponents(int width, int height) {
        setPreferredSize(new Dimension(width, height));
        setBackground(COLOR_BACKGROUND_DARK);
        setFont(FONT_LITTLE);
        setForeground(COLOR_FONT_LIGHT);
        setText("");
        setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 45, 62), 8)));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setSelectionColor(COLOR_BUTTON_HIGH);
        setSelectedTextColor(COLOR_FONT_LIGHT);
        setCaretColor(COLOR_BUTTON_HIGH);

    }
}
