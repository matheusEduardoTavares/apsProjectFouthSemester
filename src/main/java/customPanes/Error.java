package customPanes;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Error {
    public Error(String message, String title) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);    
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
