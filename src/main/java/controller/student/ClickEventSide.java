package controller.student;

import access.EnrollmentDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.TutorieModel;
import view.general.ChangePasswordFrame;
import view.general.MainWindow;
import view.student.StudentSidePanel;

public class ClickEventSide implements ActionListener {

    StudentSidePanel panel;
    private MainWindow mainWindow;

    public ClickEventSide(StudentSidePanel panel, MainWindow mainWindow) {
        this.panel = panel;
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.getBtnChangePassword()) {
            new ChangePasswordFrame(panel.getUser());
        } else if (e.getSource() == panel.getBtnAddTutorie()) {
            TutorieModel tutorie = (TutorieModel) panel.getCenterPanel().getCbxTutories().getSelectedItem();
            EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
            String emailStudent = panel.getUser().getEmail();
            int idTutorie = tutorie.getIdTutorie();
            enrollmentDAO.insertEnrollment(emailStudent, idTutorie);
        } else if (e.getSource() == panel.getBtnLogOut()) {
            mainWindow.setVisible(false);
            new MainWindow();
        }
    }

}
