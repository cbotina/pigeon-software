package controller.general;

import access.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.UserModel;
import view.general.ChangePasswordFrame;

public class ClickEventChangePassword implements ActionListener {

    private UserModel user;
    private ChangePasswordFrame frame;

    public ClickEventChangePassword(UserModel user, ChangePasswordFrame frame) {
        this.user = user;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String oldPassword = String.valueOf(frame.getPswOldPassword().getPassword());

        if (e.getSource() == frame.getBtnChange()) {
            if (oldPassword.equals(user.getPassword())) {
                String newPassword = String.valueOf(frame.getPswNewPassword().getPassword());
                UserDAO userDAO = new UserDAO();
                userDAO.updateUserPassword(newPassword, user.getEmail());
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña ingresada no es correcta", "Ha ocurrido un error", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

}
