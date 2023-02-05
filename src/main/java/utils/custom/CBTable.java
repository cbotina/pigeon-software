package utils.custom;

import com.mysql.cj.conf.ConnectionUrl;
import javax.swing.JTable;
import utils.Constants;

public class CBTable extends JTable implements Constants {

    public CBTable() {
        updateComponents();
    }

    private void updateComponents() {
        setFont(FONT_DEFAULT);
        setForeground(COLOR_FONT_DARK);
        setFocusable(false);
        setSelectionForeground(COLOR_FONT_LIGHT);
        setSelectionBackground(COLOR_BACKGROUND_LIGHT);
        setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }
}
