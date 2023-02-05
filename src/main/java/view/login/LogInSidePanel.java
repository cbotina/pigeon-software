package view.login;

import controller.login.ClickEventLogIn;
import controller.login.MouseEventRegister;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import utils.Constants;
import utils.custom.*;
import view.general.MainWindow;

public class LogInSidePanel extends JPanel implements Constants {

    private Color backGroundColor;
    private CBLabel lblTitle;
    private LogInDataPanel logInDataPanel;
    private CBImage imgUser;
    private CBButton btnLogin;
    private CBVoidPanel voidPanel;
    private CBLabel lblRegister;
    private CBLink lnkRegister;
    private LogInFooter logInFooter;
    private MainWindow panel;

    public LogInSidePanel(MainWindow panel) {
        initComponents();
        this.panel = panel;
    }

    private void initComponents() {
        setPreferredSize(new Dimension(300, 550));
        backGroundColor = COLOR_BACKGROUND_LIGHT;
        setBackground(backGroundColor);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0, 0, 25, 0);

        lblTitle = new CBLabel("Bienvenido!", COLOR_FONT_LIGHT, FONT_MEDIUM);
        c.gridy = 0;
        c.gridx = 0;
        this.add(lblTitle, c);

        imgUser = new CBImage("userImage.png");
        c.gridy = 1;
        c.gridx = 0;
        this.add(imgUser, c);

        logInDataPanel = new LogInDataPanel();
        c.gridy = 2;
        c.gridx = 0;
        this.add(logInDataPanel, c);

        btnLogin = new CBButton("Iniciar Sesión", 150, 30);
        c.gridy = 3;
        c.gridx = 0;
        this.add(btnLogin, c);

        voidPanel = new CBVoidPanel(50, 20, backGroundColor);
        c.gridy = 4;
        c.gridx = 0;
        this.add(voidPanel, c);

        logInFooter = new LogInFooter();
        c.gridy = 5;
        c.gridx = 0;
        this.add(logInFooter, c);

        ClickEventLogIn clickEvent = new ClickEventLogIn(this);
        this.getBtnLogin().addActionListener(clickEvent);
        MouseEventRegister mouseEvent = new MouseEventRegister(this.getLnkRegister());
        this.getLnkRegister().addMouseListener(mouseEvent);

    }

    //GETTER CONTROLER
    public CBButton getBtnLogin() {
        return this.btnLogin;
    }

    public CBLink getLnkRegister() {
        return this.logInFooter.getLnkRegister();
    }

    public CBTextField getTxtEmail() {
        return this.logInDataPanel.getTxtEmail();
    }

    public CBPasswordField getPswPassword() {
        return this.logInDataPanel.getPswPassword();
    }

    public MainWindow getPanel() {
        return panel;
    }

}
