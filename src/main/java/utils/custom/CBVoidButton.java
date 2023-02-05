package utils.custom;

import java.awt.event.MouseEvent;
import utils.Constants;

public class CBVoidButton extends CBButton implements Constants {

    public CBVoidButton(String text, int width, int height) {
        super(text, width, height);
        initComponents();
    }

    private void initComponents() {
        setBackground(COLOR_BACKGROUND_LIGHT);
        setFont(FONT_DEFAULT_PLUS);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(COLOR_BUTTON_HIGH);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(COLOR_FONT_LIGHT);

    }
}
