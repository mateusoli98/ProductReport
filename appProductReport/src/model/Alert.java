package model;

import javax.swing.JOptionPane;
import resource.StandardText;

public class Alert {

    private String message;
    private String title;
    private int type;

    public Alert() {
        this.message = StandardText.SUCCESS;
        this.title = StandardText.OPERATION_STATUS;
        this.type = JOptionPane.INFORMATION_MESSAGE;
    }

    public Alert(String message, String title, int type) {
        this.message = message;
        this.title = title;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }
}
