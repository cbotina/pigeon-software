package controller.student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.UserModel;
import view.student.StudentControlsPanel;

public class StudentClickEventSearch implements ActionListener {

    UserModel user;
    StudentControlsPanel panel;

    public StudentClickEventSearch(UserModel user, StudentControlsPanel panel) {
        this.user = user;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.getBtnSearch()) {

        }
    }

}
