package view.teacher;

import controller.teacher.ClickEventCreateTutorie;
import java.awt.Dimension;
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
import utils.custom.CBTextField;

public class TeacherCreateTutorie extends JFrame {

    private UserModel user;
    private CBLabel lblTitle;
    private CBTextField txtTitle;
    private CBLabel lblDescription;
    private CBTextField txtDescription;
    private CBLabel lblYear;
    private CBTextField txtYear;
    private CBButton btnCreateTutorie;

    public TeacherCreateTutorie(UserModel user) {
        initComponents(user);
    }

    private void initComponents(UserModel user) {
        setTitle("Crear Tutoria");
        setSize(450, 400);

        JPanel backGroundPanel = new JPanel();
        backGroundPanel.setBackground(Constants.COLOR_BACKGROUND_LIGHT);
        backGroundPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 10, 5);

        JPanel dataPanel = new JPanel();
        dataPanel.setBackground(Constants.COLOR_BACKGROUND_LIGHT);
        dataPanel.setLayout(new GridBagLayout());
        dataPanel.setPreferredSize(new Dimension(400, 50));
        GridBagConstraints c1 = new GridBagConstraints();
        c1.insets = new Insets(0, 5, 0, 5);

        lblTitle = new CBLabel("Titulo ", Constants.COLOR_BACKGROUND_DARK, Constants.FONT_DEFAULT);
        c1.gridy = 0;
        c1.gridx = 0;
        dataPanel.add(lblTitle, c1);

        txtTitle = new CBTextField(130, 30);
        c1.gridy = 0;
        c1.gridx = 1;
        dataPanel.add(txtTitle, c1);

        lblYear = new CBLabel("Año  ", Constants.COLOR_BACKGROUND_DARK, Constants.FONT_DEFAULT);
        c1.gridy = 0;
        c1.gridx = 2;
        dataPanel.add(lblYear, c1);

        txtYear = new CBTextField(130, 30);
        c1.gridy = 0;
        c1.gridx = 3;
        dataPanel.add(txtYear, c1);

        c.gridy = 0;
        c.gridx = 0;
        backGroundPanel.add(dataPanel, c);

        lblDescription = new CBLabel("Descripción", Constants.COLOR_BACKGROUND_DARK, Constants.FONT_DEFAULT);
        c.gridy = 1;
        c.gridx = 0;
        backGroundPanel.add(lblDescription, c);

        txtDescription = new CBTextField(350, 90);
        c.gridy = 2;
        c.gridx = 0;
        backGroundPanel.add(txtDescription, c);

        btnCreateTutorie = new CBButton("Crear Tutoría", 150, 30);
        ClickEventCreateTutorie e = new ClickEventCreateTutorie(user, this);
        btnCreateTutorie.addActionListener(e);
        c.gridy = 3;
        c.gridx = 0;
        backGroundPanel.add(btnCreateTutorie, c);

        int[] center = SetLocationCenter.center(this.getSize());
        setLocation(center[0], center[1]);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.add(backGroundPanel);
        setVisible(true);
    }

    public CBButton getBtnCreateTutorie() {
        return btnCreateTutorie;
    }

    public UserModel getUser() {
        return user;
    }

    public CBTextField getTxtTitle() {
        return txtTitle;
    }

    public CBTextField getTxtDescription() {
        return txtDescription;
    }

    public CBTextField getTxtYear() {
        return txtYear;
    }

}
