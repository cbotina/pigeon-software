package utils.custom;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CBImage extends JLabel {

    private ImageIcon icon;

    public CBImage(String name) {
        initComponents(name);
    }

    private void initComponents(String name) {
        icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\utils\\images\\" + name);
        setIcon(icon);
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }

}
