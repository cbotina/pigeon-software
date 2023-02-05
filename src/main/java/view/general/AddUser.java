package view.general;

import controller.register.ClickEventRegister;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;
import utils.Constants;
import utils.SetLocationCenter;
import utils.custom.CBButton;
import utils.custom.CBComboBox;
import utils.custom.CBImage;
import utils.custom.CBLabel;
import utils.custom.CBPasswordField;
import utils.custom.CBTextField;
import utils.custom.CBVoidPanel;

public class AddUser extends JFrame implements Constants {

    private JPanel backGroundPanel;
    private CBLabel lblCreate;
    private CBImage imgNewUser;
    private CBLabel lblEmail;
    private CBTextField txtEmail;
    private CBLabel lblName;
    private CBTextField txtName;
    private CBLabel lblSurname;
    private CBTextField txtSurname;
    private CBLabel lblAge;
    private CBTextField txtAge;
    private CBLabel lblPassword;
    private CBPasswordField pswPassword;
    private JPanel dataPanel1;
    private JPanel dataPanel2;
    private CBComboBox cbxRole;
    private CBButton btnRegister;

    int[] center;

    public AddUser() {
        initComponents();
    }

    private void initComponents() {
        setTitle("New User");
        setSize(new Dimension(400, 600));
        setLayout(new BorderLayout(0, 0));

        backGroundPanel = new JPanel();
        backGroundPanel.setBackground(COLOR_BACKGROUND_LIGHT);
        backGroundPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0, 0, 3, 0);

        lblCreate = new CBLabel("Crear Nuevo Usuario", COLOR_FONT_LIGHT, FONT_MEDIUM);
        c.gridy = 0;
        c.gridx = 0;
        backGroundPanel.add(lblCreate, c);

        dataPanel1 = new JPanel();
        dataPanel1.setBackground(COLOR_BACKGROUND_LIGHT);
        dataPanel1.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        c1.insets = new Insets(0, 0, 10, 0);

        lblEmail = new CBLabel("Correo      ", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c1.gridy = 0;
        c1.gridx = 0;
        dataPanel1.add(lblEmail, c1);

        txtEmail = new CBTextField(210, 30);
        c1.gridy = 0;
        c1.gridx = 1;
        dataPanel1.add(txtEmail, c1);

        lblName = new CBLabel("Nombres      ", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c1.gridy = 1;
        c1.gridx = 0;
        dataPanel1.add(lblName, c1);
        txtName = new CBTextField(210, 30);
        c1.gridy = 1;
        c1.gridx = 1;
        dataPanel1.add(txtName, c1);
        lblSurname = new CBLabel("Apellidos      ", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c1.gridy = 2;
        c1.gridx = 0;
        dataPanel1.add(lblSurname, c1);
        txtSurname = new CBTextField(210, 30);
        c1.gridy = 2;
        c1.gridx = 1;
        dataPanel1.add(txtSurname, c1);

        dataPanel2 = new JPanel();
        dataPanel2.setBackground(COLOR_BACKGROUND_LIGHT);
        dataPanel2.setLayout(new GridBagLayout());
        GridBagConstraints c2 = new GridBagConstraints();
        c2.insets = new Insets(0, 3, 0, 3);
        lblAge = new CBLabel("Edad  ", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c2.gridy = 0;
        c2.gridx = 0;
        dataPanel2.add(lblAge, c2);
        txtAge = new CBTextField(40, 30);
        txtAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.gridy = 0;
        c2.gridx = 1;
        dataPanel2.add(txtAge, c2);
        lblPassword = new CBLabel("   Contraseña  ", COLOR_FONT_LIGHT, FONT_DEFAULT);
        c2.gridy = 0;
        c2.gridx = 2;
        dataPanel2.add(lblPassword, c2);
        pswPassword = new CBPasswordField(100, 30);
        c2.gridy = 0;
        c2.gridx = 3;
        dataPanel2.add(pswPassword, c2);

        imgNewUser = new CBImage("addNewUserImage.png");
        c.gridy = 2;
        c.gridx = 0;
        backGroundPanel.add(imgNewUser, c);

        c.gridy = 3;
        c.gridx = 0;
        backGroundPanel.add(dataPanel1, c);

        c.gridy = 4;
        c.gridx = 0;
        backGroundPanel.add(dataPanel2, c);

        c.gridy = 5;
        c.gridx = 0;
        backGroundPanel.add(new CBVoidPanel(200, 25, COLOR_BACKGROUND_LIGHT), c);

        cbxRole = new CBComboBox();
        cbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"  Docente  ", "  Estudiante  "}));
        c.gridy = 6;
        c.gridx = 0;
        backGroundPanel.add(cbxRole, c);

        c.gridy = 7;
        c.gridx = 0;
        backGroundPanel.add(new CBVoidPanel(200, 25, COLOR_BACKGROUND_LIGHT), c);

        btnRegister = new CBButton("Crear Cuenta", 200, 30);
        ClickEventRegister e = new ClickEventRegister(this);
        btnRegister.addActionListener(e);
        c.gridy = 8;
        c.gridx = 0;
        backGroundPanel.add(btnRegister, c);

        /////////
        this.add(backGroundPanel, BorderLayout.CENTER);
        center = SetLocationCenter.center(this.getSize());
        setLocation(center[0], center[1]);
        setVisible(true);
    }

    public CBTextField getTxtEmail() {
        return this.txtEmail;
    }

    public CBTextField getTxtName() {
        return this.txtName;
    }

    public CBTextField getTxtSurname() {
        return this.txtSurname;
    }

    public CBTextField getTxtAge() {
        return this.txtAge;
    }

    public CBPasswordField getPswPassword() {
        return this.pswPassword;
    }

    public CBComboBox getcbxRole() {
        return this.cbxRole;
    }

    public CBButton getBtnRegister() {
        return this.btnRegister;
    }
}
