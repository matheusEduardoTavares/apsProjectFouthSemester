package customPanes;

import io.FileIO;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JOptionPaneMultiInput extends JFrame {
    public JOptionPaneMultiInput() throws Exception {
      GridLayout layout = new GridLayout(4, 3);
      layout.setVgap(20);
      JPanel panel = new JPanel(layout);
      JLabel text1 = new JLabel("Valor mínimo: ");
      JTextField text2 = new JTextField(10);
      JLabel text3 = new JLabel("Valor máximo: ");
      JTextField text4 = new JTextField(10);
      JLabel text5 = new JLabel("Quantidade de números: ");
      JTextField text6 = new JTextField(10);
      panel.add(text1);
      panel.add(text2);
      panel.add(text3);
      panel.add(text4);
      panel.add(text5);
      panel.add(text6);
      int result = JOptionPane.showConfirmDialog(null, panel, 
                 "Entre com os valores", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
        try {
            int min = Integer.parseInt(text2.getText());
            int max = Integer.parseInt(text4.getText());
            int quant = Integer.parseInt(text6.getText());
            if (quant <= 0 ) throw new Exception("Digite apenas números inteiros, e o campo quantidade deve ser maior que 0"); 
            int values[] = {min, max, quant};
            FileIO.valuesForFiles = values;
        }
        catch (NumberFormatException e) {
            FileIO.isValue = false;
        }
      }
      else {
        FileIO.cancelOperation = true;;
      }
    }
}