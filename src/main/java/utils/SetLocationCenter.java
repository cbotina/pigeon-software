package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class SetLocationCenter extends JFrame {

    public static int[] center(Dimension frameSize) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width - frameSize.width) / 2;
        int height = (int) (screenSize.height - frameSize.height) / 2;
        int[] position = {width, height};
        return position;
    }

}
