package controller.login;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import static utils.Constants.COLOR_BUTTON_HIGH;
import static utils.Constants.COLOR_FONT_LIGHT;
import utils.custom.CBLink;
import view.general.AddUser;

public class MouseEventRegister implements MouseListener {

    CBLink lnkRegister;

    public MouseEventRegister(CBLink lnkRegister) {
        this.lnkRegister = lnkRegister;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        new AddUser();

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lnkRegister.setForeground(COLOR_BUTTON_HIGH);
        Map attributes = lnkRegister.getFont().getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lnkRegister.setFont(lnkRegister.getFont().deriveFont(attributes));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lnkRegister.setFont(lnkRegister.getFont());
        lnkRegister.setForeground(COLOR_FONT_LIGHT);

    }

}
