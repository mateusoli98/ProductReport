
import resource.StandardText;
import views.JFMain;

/**
 *
 * @author Mateus
 */
public class Main {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Default".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(StandardText.ERROR + ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JFMain().setVisible(true);
        });
    }
}
