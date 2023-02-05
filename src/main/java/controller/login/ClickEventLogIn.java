package controller.login;

import access.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.UserModel;
import view.general.MainWindow;
import view.login.LogInSidePanel;

public class ClickEventLogIn implements ActionListener {

    private LogInSidePanel logInSidePanel;

    public ClickEventLogIn(LogInSidePanel logInSidePanel) {
        this.logInSidePanel = logInSidePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.logInSidePanel.getBtnLogin()) {
            String email = (String) this.logInSidePanel.getTxtEmail().getText();
            String password = String.valueOf(this.logInSidePanel.getPswPassword().getPassword());
            if (!email.equals("") && !password.equals("")) {
                UserDAO userDAO = new UserDAO();
                HashMap<String, String> data = userDAO.getEmailsPasswords();
                if (data.containsKey(email)) {
                    if (data.get(email).equals(password)) {
                        UserModel user = userDAO.getUserByEmail(email);
                        JOptionPane.showMessageDialog(null, "Bienvenido " + user);
                        new MainWindow(user, user.getIdRole());//ventana usuario
                        logInSidePanel.getPanel().setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Correo bien pero contraseña mal");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El email ingresado no está en la base de datos", "Espera", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Llenar todos los campos antes de continuar", "Espera", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

}
