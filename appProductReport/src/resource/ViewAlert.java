package resource;

import javax.swing.JOptionPane;
import model.Alert;

abstract public class ViewAlert {

    public static void show(Alert alert) {
        JOptionPane.showMessageDialog(null, alert.getMessage(), alert.getTitle(), alert.getType());
    }
}
