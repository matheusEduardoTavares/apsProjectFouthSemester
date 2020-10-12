/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customPanes;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class Error {
    public Error(String message, String title) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);    
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
