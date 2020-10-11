package io;

import java.io.File;
import javax.swing.JFrame;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class FileIO extends JFrame {
    public static ArrayList<File> files = new ArrayList<File>();
    
    public FileIO(boolean op){
        if (op) createFiles();
        else valueFiles();
    }
    
    private void createFiles() { 
        files.add(new File("Algoritmo1.txt"));
        files.add(new File("Algoritmo2.txt"));
        files.add(new File("Algoritmo3.txt"));
        confirmCreatedFiles(files);
    }
    
    private void confirmCreatedFiles(ArrayList<File> files) {
        boolean generated = false;
        for (File file : files){
            try {
                if (file.createNewFile()) {
                  generated = true;
                } else {
                  JOptionPane optionPane = new JOptionPane(("Aquivo " + file.getName() + " já existe!"), JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Arquivo já existente");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
            } catch (IOException e) {
                JOptionPane optionPane = new JOptionPane("Não foi possível gerar os arquivos.", JOptionPane.ERROR_MESSAGE);    
                JDialog dialog = optionPane.createDialog("Erro");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }
        }
        if (generated) {
            JOptionPane.showMessageDialog(null, "Ao menos um arquivo foi gerado com sucesso !");
        }
    }
    
    private void valueFiles() { 
        System.out.println("oi");
    }
}
