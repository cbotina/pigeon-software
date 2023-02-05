package controller.register;

import access.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.UserModel;
import view.general.AddUser;

public class ClickEventRegister implements ActionListener {

    AddUser addUserPanel;

    public ClickEventRegister(AddUser addUserPanel) {
        this.addUserPanel = addUserPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addUserPanel.getBtnRegister()) {
            String email = (String) addUserPanel.getTxtEmail().getText();
            String name = (String) addUserPanel.getTxtName().getText();
            String surname = (String) addUserPanel.getTxtSurname().getText();
            int age = Integer.parseInt((String) (addUserPanel.getTxtAge().getText()));
            String password = String.valueOf(addUserPanel.getPswPassword().getPassword());
            int role = addUserPanel.getcbxRole().getSelectedIndex();
            System.out.println(role);
            UserModel user = new UserModel(email, name, surname, age, password, role + 1);
            UserDAO userDAO = new UserDAO();
            userDAO.insertUser(user);
            addUserPanel.setVisible(false);
        }
    }

}
