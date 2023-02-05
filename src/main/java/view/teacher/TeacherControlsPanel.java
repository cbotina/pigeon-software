package view.teacher;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import utils.Constants;
import utils.custom.CBButton;
import utils.custom.CBComboBox;

public class TeacherControlsPanel extends JPanel implements Constants {

    private CBComboBox cbxOrderBy;
    private CBButton btnSearch;

    public TeacherControlsPanel() {
        initComponents();
    }

    private void initComponents() {
        setBackground(COLOR_BACKGROUND_LIGHT);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 3, 3, 10);
        cbxOrderBy = new CBComboBox();

        cbxOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"  Todas las matrículas  ", "  Matrículas a mis Tutorías  "}));
        c.gridy = 0;
        c.gridx = 0;
        this.add(cbxOrderBy, c);

        btnSearch = new CBButton("Realizar consulta", 180, 30);
        c.gridy = 0;
        c.gridx = 1;
        this.add(btnSearch, c);

    }

    public CBButton getBtnSearch() {
        return btnSearch;
    }

    public CBComboBox getCbxOrderBy() {
        return cbxOrderBy;
    }

}
