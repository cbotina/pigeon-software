package controller.teacher;

import access.EnrollmentDAO;
import access.EnrollmentQueryModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import view.teacher.TeacherCenterPanel;

public class ClickEventSearch implements ActionListener {

    private TeacherCenterPanel panel;

    public ClickEventSearch(TeacherCenterPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.getBtnSearch()) {
            EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
            ArrayList<EnrollmentQueryModel> enrollments;
            int orderBy = panel.getCbxOrderBy().getSelectedIndex();
            switch (orderBy) {
                case 0:

                    enrollments = enrollmentDAO.getAllEnrollments();
                    panel.setTableResults(enrollments);
                    System.out.println(panel.getCbxOrderBy().getSelectedIndex());
                    break;
                case 1:
                    String teacherEmail = panel.getUser().getEmail();
                    enrollments = enrollmentDAO.getEnrollmentsByTeacher(teacherEmail);
                    panel.setTableResults(enrollments);
                    System.out.println(panel.getCbxOrderBy().getSelectedIndex());
                    break;
            }

        }
    }

}
