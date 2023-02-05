package view.student;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import utils.Constants;
import utils.custom.CBButton;
import utils.custom.CBComboBox;

public class StudentControlsPanel extends JPanel implements Constants {

    private CBComboBox cbxOrderBy;
    private CBButton btnSearch;

    public StudentControlsPanel() {
        initComponents();
    }

    private void initComponents() {
        setBackground(COLOR_BACKGROUND_LIGHT);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 3, 3, 10);
        cbxOrderBy = new CBComboBox();

        cbxOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"  Todas las tutorías  ", "  Ordenar por Docente  "}));
        c.gridy = 0;
        c.gridx = 0;
        this.add(cbxOrderBy, c);

        btnSearch = new CBButton("Realizar consulta", 180, 30);
        c.gridy = 0;
        c.gridx = 1;
        this.add(btnSearch, c);

    }

    public CBComboBox getCbxOrderBy() {
        return cbxOrderBy;
    }

    public CBButton getBtnSearch() {
        return btnSearch;
    }

}
