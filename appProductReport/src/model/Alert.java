package model;

import javax.swing.JOptionPane;

public class Alert {

    private String message;
    private String title;
    private int type;

    public Alert() {
        this.message = "Sucesso";
        this.title = "Status da operacao";
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
