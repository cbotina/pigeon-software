package view.teacher;

import access.EnrollmentDAO;
import access.EnrollmentQueryModel;
import controller.teacher.ClickEventSearch;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import model.UserModel;
import utils.Constants;
import static utils.Constants.COLOR_BACKGROUND_LIGHT;
import utils.custom.CBButton;
import utils.custom.CBComboBox;
import utils.custom.CBLabel;
import utils.custom.CBTable;
import utils.custom.CBVoidPanel;

public class TeacherCenterPanel extends JPanel implements Constants {

    private CBLabel labelTitle;
    private CBLabel labelName;
    private JScrollPane jsPane;
    private CBTable resultsTable;
    private CBVoidPanel voidPanel1;
    private CBVoidPanel voidPanel2;
    private TeacherControlsPanel controlsPanel;
    private UserModel user;

    public TeacherCenterPanel(UserModel user) {
        initComponents(user);
    }

    public void initComponents(UserModel user) {
        this.user = user;
        setPreferredSize(new Dimension(625, 550));
        setBackground(COLOR_BACKGROUND_LIGHT);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0, 0, 10, 0);

        labelTitle = new CBLabel("Lista de Matriculas", COLOR_FONT_LIGHT, FONT_BIG);
        c.gridy = 0;
        c.gridx = 0;
        this.add(labelTitle, c);

        labelName = new CBLabel("Docente encargado:   " + user, COLOR_FONT_LIGHT, FONT_DEFAULT_PLUS);
        c.gridy = 1;
        c.gridx = 0;
        this.add(labelName, c);

        voidPanel1 = new CBVoidPanel(500, 30, COLOR_BACKGROUND_LIGHT);
        c.gridy = 2;
        c.gridx = 0;
        this.add(voidPanel1, c);

        resultsTable = new CBTable();
        resultsTable.setPreferredScrollableViewportSize(new Dimension(500, 200));
        jsPane = new JScrollPane();
        jsPane.setViewportView(resultsTable);
        jsPane.setPreferredSize(new Dimension(500, 200));

        c.gridy = 3;
        c.gridx = 0;
        this.add(jsPane, c);

        voidPanel2 = new CBVoidPanel(500, 20, COLOR_BACKGROUND_LIGHT);
        c.gridy = 4;
        c.gridx = 0;
        this.add(voidPanel2, c);

        controlsPanel = new TeacherControlsPanel();
        ClickEventSearch l = new ClickEventSearch(this);
        this.getBtnSearch().addActionListener(l);

        c.gridy = 5;
        c.gridx = 0;
        this.add(controlsPanel, c);

    }

    public CBTable getTable() {
        return this.resultsTable;
    }

    public void initTableResults() {
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        ArrayList<EnrollmentQueryModel> enrollments = enrollmentDAO.getAllEnrollments();
        setTableResults(enrollments);
    }

    public void setTableResults(ArrayList<EnrollmentQueryModel> results) {
        String[] headers = {"ID", "TITULO", "NOMBRE", "AÑO"};
        this.resultsTable.removeAll();

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers);

        this.resultsTable.setModel(tableModel);
        for (int i = 0; i < results.size(); i++) {
            tableModel.addRow(results.get(i).toArray());
        }

    }

    public CBButton getBtnSearch() {
        return controlsPanel.getBtnSearch();
    }

    public CBComboBox getCbxOrderBy() {
        return controlsPanel.getCbxOrderBy();
    }

    public UserModel getUser() {
        return user;
    }

}
