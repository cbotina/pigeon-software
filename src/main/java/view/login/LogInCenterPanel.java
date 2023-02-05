package view.login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import utils.Constants;
import utils.custom.CBImage;

public class LogInCenterPanel extends JPanel implements Constants {

    public LogInCenterPanel() {
        initComponents();
    }

    private void initComponents() {
        setPreferredSize(new Dimension(625, 550));
        setLayout(new BorderLayout());
        setBackground(COLOR_BACKGROUND_LIGHT);
        this.add(new CBImage("sideImage.jpg"));
    }
}
