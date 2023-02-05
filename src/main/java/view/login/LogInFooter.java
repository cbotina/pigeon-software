package view.login;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import utils.Constants;
import utils.custom.CBLabel;
import utils.custom.CBLink;

public class LogInFooter extends JPanel implements Constants {

    private CBLabel lblRegister;
    private CBLink lnkRegister;

    public LogInFooter() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridBagLayout());
        setBackground(COLOR_BACKGROUND_LIGHT);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0, 0, 2, 0);

        lblRegister = new CBLabel("¿No tienes una cuenta?", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c.gridy = 0;
        c.gridx = 0;
        this.add(lblRegister, c);

        lnkRegister = new CBLink("¡Regístrate Gratis!");
        c.gridy = 1;
        c.gridx = 0;
        this.add(lnkRegister, c);
    }

    public CBLink getLnkRegister() {
        return this.lnkRegister;
    }
}
