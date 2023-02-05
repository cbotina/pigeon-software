package controller.teacher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.general.ChangePasswordFrame;
import view.general.MainWindow;
import view.teacher.TeacherCreateTutorie;
import view.teacher.TeacherSidePanel;

public class ClickEventSide implements ActionListener {

    private TeacherSidePanel panel;
    private MainWindow mainWindow;

    public ClickEventSide(TeacherSidePanel panel, MainWindow mainWindow) {
        this.panel = panel;
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.getBtnLogOut()) {
            mainWindow.setVisible(false);
            new MainWindow();
        } else if (e.getSource() == panel.getBtnCreateTutorie()) {
            new TeacherCreateTutorie(panel.getUser());
        } else if (e.getSource() == panel.getBtnChangePassword()) {
            new ChangePasswordFrame(panel.getUser());
        }
    }

}
