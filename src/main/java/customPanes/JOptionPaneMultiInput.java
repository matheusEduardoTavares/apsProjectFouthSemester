package customPanes;

import io.FileIO;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JOptionPaneMultiInput extends JFrame {
    public JOptionPaneMultiInput() throws Exception {
        JTextField minimumValue = new JTextField(5);
        JTextField maximumValue = new JTextField(5);
        JTextField quantity = new JTextField(5);

        JPanel customPanel = new JPanel();
        customPanel.add(new JLabel("Valor mínimo:"));
        customPanel.add(minimumValue);
        customPanel.add(Box.createHorizontalStrut(15));
        customPanel.add(new JLabel("Valor máximo:"));
        customPanel.add(maximumValue);
        customPanel.add(Box.createHorizontalStrut(15));
        customPanel.add(new JLabel("Quantidade de números:"));
        customPanel.add(quantity);
        
        JFrame teste = new JFrame();
        teste.setVisible(true);
        teste.setLocation(100, 100);
        teste.setAlwaysOnTop(true);
        int result = JOptionPane.showConfirmDialog(teste, customPanel, 
                 "Entre com os valores", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
           try {
               int min = Integer.parseInt(minimumValue.getText());
               int max = Integer.parseInt(maximumValue.getText());
               int quant = Integer.parseInt(quantity.getText());
               if (quant <= 0 ) throw new Exception("Digite apenas números inteiros, e o campo quantidade deve ser maior que 0"); 
               int values[] = {min, max, quant};
               FileIO.valuesForFiles = values;
               teste.dispose();
           }
           catch (NumberFormatException e) {
               FileIO.isValue = false;
           }
        }
        else {
            FileIO.cancelOperation = true;
            teste.dispose();
        }
    }
}
