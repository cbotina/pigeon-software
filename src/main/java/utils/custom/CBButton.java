package utils.custom;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import utils.Constants;

public class CBButton extends JButton implements Constants, MouseListener {

    public CBButton(String text, int width, int height) {
        initComponents(text, width, height);
    }

    private void initComponents(String text, int width, int height) {
        setBackground(COLOR_BUTTON_LOW);
        setFont(FONT_DEFAULT);
        setForeground(COLOR_FONT_LIGHT);
        setPreferredSize(new Dimension(width, height));
        setText(text);
        setBorder(null);
        setFocusable(false);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(COLOR_BUTTON_HIGH);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(COLOR_BUTTON_LOW);
    }
}
