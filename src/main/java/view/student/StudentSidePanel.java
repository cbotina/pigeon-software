package view.student;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import model.UserModel;
import utils.Constants;
import utils.custom.CBSeparator;
import utils.custom.CBVoidButton;
import controller.student.ClickEventSide;
import view.general.MainWindow;

public class StudentSidePanel extends JPanel implements Constants {

    private UserModel user;
    private CBVoidButton btnAddTutorie;
    private CBVoidButton btnChangePassword;
    private CBVoidButton btnLogOut;
    private StudentCenterPanel centerPanel;
    private MainWindow mainWindow;

    public StudentSidePanel(UserModel user, StudentCenterPanel centerPanel, MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        initComponents(user, centerPanel);
    }

    private void initComponents(UserModel user, StudentCenterPanel centerPanel) {
        this.user = user;
        this.centerPanel = centerPanel;
        setPreferredSize(new Dimension(300, 550));
        setBackground(COLOR_BACKGROUND_LIGHT);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        ClickEventSide e = new ClickEventSide(this, mainWindow);

        btnAddTutorie = new CBVoidButton("Matricular Tutoría", 180, 40);
        btnAddTutorie.addActionListener(e);
        c.gridy = 0;
        c.gridx = 0;
        this.add(btnAddTutorie, c);

        c.gridy = 1;
        c.gridx = 0;
        this.add(new CBSeparator(200), c);

        btnChangePassword = new CBVoidButton("Cambiar contraseña", 180, 40);
        btnChangePassword.addActionListener(e);
        c.gridy = 2;
        c.gridx = 0;
        this.add(btnChangePassword, c);

        c.gridy = 3;
        c.gridx = 0;
        this.add(new CBSeparator(200), c);

        btnLogOut = new CBVoidButton("Cerrar Sesión", 180, 40);
        btnLogOut.addActionListener(e);
        c.gridy = 4;
        c.gridx = 0;
        this.add(btnLogOut, c);

    }

    public StudentCenterPanel getCenterPanel() {
        return centerPanel;
    }

    public UserModel getUser() {
        return user;
    }

    public CBVoidButton getBtnAddTutorie() {
        return btnAddTutorie;
    }

    public CBVoidButton getBtnChangePassword() {
        return btnChangePassword;
    }

    public CBVoidButton getBtnLogOut() {
        return btnLogOut;
    }

}
