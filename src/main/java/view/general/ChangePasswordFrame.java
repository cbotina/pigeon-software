package view.general;

import controller.general.ClickEventChangePassword;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.UserModel;
import utils.Constants;
import utils.SetLocationCenter;
import utils.custom.CBButton;
import utils.custom.CBLabel;
import utils.custom.CBPasswordField;

public class ChangePasswordFrame extends JFrame {

    private UserModel user;
    private CBLabel lblTitle;
    private CBLabel lblOldPassword;
    private CBPasswordField pswOldPassword;
    private CBLabel lblNewPassword;
    private CBPasswordField pswNewPassword;
    private CBButton btnChange;

    public ChangePasswordFrame(UserModel user) {
        initComponents(user);
    }

    private void initComponents(UserModel user) {
        setTitle("Cambio de contraseña");
        setSize(350, 250);

        JPanel backGroundPanel = new JPanel();
        backGroundPanel.setBackground(Constants.COLOR_BACKGROUND_LIGHT);
        backGroundPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        JPanel dataPanel = new JPanel();
        dataPanel.setBackground(Constants.COLOR_BACKGROUND_LIGHT);
        dataPanel.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        c1.insets = new Insets(5, 5, 5, 5);

        lblOldPassword = new CBLabel("Contraseña actual  ", Constants.COLOR_BACKGROUND_DARK, Constants.FONT_DEFAULT);
        c1.gridy = 0;
        c1.gridx = 0;
        dataPanel.add(lblOldPassword, c1);

        pswOldPassword = new CBPasswordField(130, 30);
        c1.gridy = 0;
        c1.gridx = 1;
        dataPanel.add(pswOldPassword, c1);

        lblNewPassword = new CBLabel("Nueva contraseña  ", Constants.COLOR_BACKGROUND_DARK, Constants.FONT_DEFAULT);
        c1.gridy = 1;
        c1.gridx = 0;
        dataPanel.add(lblNewPassword, c1);

        pswNewPassword = new CBPasswordField(130, 30);
        c1.gridy = 1;
        c1.gridx = 1;
        dataPanel.add(pswNewPassword, c1);

        c.gridy = 1;
        c.gridx = 0;
        backGroundPanel.add(dataPanel, c);

        btnChange = new CBButton("Cambiar contraseña", 150, 30);
        ClickEventChangePassword e = new ClickEventChangePassword(user, this);
        btnChange.addActionListener(e);
        c.gridy = 2;
        c.gridx = 0;
        backGroundPanel.add(btnChange, c);

        int[] center = SetLocationCenter.center(this.getSize());
        setLocation(center[0], center[1]);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.add(backGroundPanel);
        setVisible(true);
    }

    public CBPasswordField getPswOldPassword() {
        return pswOldPassword;
    }

    public CBPasswordField getPswNewPassword() {
        return pswNewPassword;
    }

    public CBButton getBtnChange() {
        return btnChange;
    }
}
