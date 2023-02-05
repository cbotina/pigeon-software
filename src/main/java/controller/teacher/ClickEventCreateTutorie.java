package controller.teacher;

import access.TutorieDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.TutorieModel;
import model.UserModel;
import view.teacher.TeacherCreateTutorie;

public class ClickEventCreateTutorie implements ActionListener {

    private TeacherCreateTutorie frame;
    private UserModel teacher;

    public ClickEventCreateTutorie(UserModel teacher, TeacherCreateTutorie frame) {
        this.frame = frame;
        this.teacher = teacher;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame.getBtnCreateTutorie()) {
            TutorieDAO tutorieDAO = new TutorieDAO();

            String title = (String) frame.getTxtTitle().getText();
            String description = (String) frame.getTxtDescription().getText();
            int year = Integer.parseInt(frame.getTxtYear().getText());
            String idTeacher = teacher.getEmail();

            TutorieModel tutorie = new TutorieModel(title, description, year, idTeacher);
            tutorieDAO.insertTutorie(tutorie);
            frame.setVisible(false);
        }
    }

}
