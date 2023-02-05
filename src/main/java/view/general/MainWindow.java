package view.general;

import view.login.LogInCenterPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.UserModel;
import utils.SetLocationCenter;
import view.login.LogInSidePanel;
import view.student.StudentCenterPanel;
import view.student.StudentSidePanel;
import view.teacher.TeacherCenterPanel;
import view.teacher.TeacherSidePanel;

public class MainWindow extends JFrame {

    private JPanel backGroundPanel;
    String hola = "Oh siquesi 7u7";

    public MainWindow() {
        makeBackGroundPanel();
        makeLogInWindow(this);
        initComponents();
    }

    public MainWindow(UserModel user, int type) {
        makeBackGroundPanel();
        switch (type) {
            case 1:
                makeTeacherWindow(user);
                break;
            case 2:
                makeStudentWindow(user);
                break;
        }
        initComponents();
    }

    private void initComponents() {
        setTitle("Pigeon v1.1");
        setSize(1025, 650);
        setResizable(true);
        setLayout(new BorderLayout(0, 0));

        this.add(backGroundPanel, BorderLayout.CENTER);

        int[] center = SetLocationCenter.center(this.getSize());
        setLocation(center[0], center[1]);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void makeBackGroundPanel() {
        backGroundPanel = new JPanel();
        backGroundPanel.setBackground(utils.Constants.COLOR_BACKGROUND_DARK);
        backGroundPanel.setLayout(new FlowLayout(1, 25, 25));
    }

    private void makeLogInWindow(MainWindow panel) {

        
        LogInCenterPanel centerPanel = new LogInCenterPanel();
        backGroundPanel.add(centerPanel);
        LogInSidePanel sidePanel = new LogInSidePanel(panel);
        backGroundPanel.add(sidePanel);

    }

    private void makeTeacherWindow(UserModel user) {

        
        TeacherCenterPanel centerPanel = new TeacherCenterPanel(user);
        backGroundPanel.add(centerPanel);
        TeacherSidePanel sidePanel = new TeacherSidePanel(user, this);
        backGroundPanel.add(sidePanel);

    }

    private void makeStudentWindow(UserModel user) {
        StudentCenterPanel centerPanel = new StudentCenterPanel(user);
        backGroundPanel.add(centerPanel);

        StudentSidePanel sidePanel = new StudentSidePanel(user, centerPanel, this);
        backGroundPanel.add(sidePanel);
    }
      
   

}
