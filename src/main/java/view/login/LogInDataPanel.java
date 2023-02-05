package view.login;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import utils.Constants;
import utils.custom.*;

public class LogInDataPanel extends JPanel implements Constants {

    private CBLabel lblEmail;
    private CBTextField txtEmail;
    private CBLabel lblPassword;
    private CBPasswordField pswPassword;

    public LogInDataPanel() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridBagLayout());
        setBackground(COLOR_BACKGROUND_LIGHT);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0, 0, 5, 0);

        lblEmail = new CBLabel("Correo    ", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c.gridy = 0;
        c.gridx = 0;
        this.add(lblEmail, c);

        txtEmail = new CBTextField(180, 30);
        c.gridy = 0;
        c.gridx = 1;
        this.add(txtEmail, c);

        lblPassword = new CBLabel("Contraseña    ", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c.gridy = 1;
        c.gridx = 0;
        this.add(lblPassword, c);

        pswPassword = new CBPasswordField(180, 30);
        c.gridy = 1;
        c.gridx = 1;
        this.add(pswPassword, c);
    }

    public CBTextField getTxtEmail() {
        return txtEmail;
    }

    public CBPasswordField getPswPassword() {
        return pswPassword;
    }

}
