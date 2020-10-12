package io;

import customPanes.JOptionPaneMultiInput;
import customPanes.Error;
import helpers.RandomNumbers;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFrame;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import main.Main;

public class FileIO extends JFrame {
    public static ArrayList<File> files = new ArrayList<File>();
    public static int[] valuesForFiles = new int[3];
    public static boolean isValue;
    public static boolean cancelOperation;
    
    public FileIO(boolean op){
        if (op) createFiles();
        else {
            try {
                valueFiles();
            }
            catch (Exception e) {
                new Error(e.getMessage(), "Erro");
            }
        }
    }
    
    private void createFiles() { 
        files.clear();
        for (Object fileName : Main.algorithms) {
            files.add(new File(fileName.toString() + ".txt"));
            confirmCreatedFiles(files);
        }
    }
    
    static public void getFilesPath(String currentDirectory, String extension, boolean getName, ArrayList<Object> arm) {
        files.clear();
        try{
            File currentDirFile = new File(currentDirectory);
            String helper = currentDirFile.getAbsolutePath();
            File folder = new File(helper);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String filename = file.getName();
                    if (filename.contains(extension)) {
                        int indexPoint = filename.indexOf(".");
                        String nameFileWithoutExtension = filename.substring(0, indexPoint);
                        if (!getName) {
                            if (Main.algorithms.contains(nameFileWithoutExtension)) files.add(file);
                        }
                        else arm.add(file.getName());
                    }
                }
            }
            System.out.println("files " + files.toString());
        }
        catch (Exception e) {
            System.out.println(e.toString());
            new Error("Não foi possível encontrar a pasta do projeto.", "Erro");
        }
    }
    
    private void confirmCreatedFiles(ArrayList<File> files) {
        boolean generated = false;
        for (File file : files){
            try {
                if (file.createNewFile()) {
                  generated = true;
                } 
                else {
                  new Error(("Aquivo " + file.getName() + " já existe!"), "Arquivo já existente");
                }
            } catch (IOException e) {
                new Error("Não foi possível gerar os arquivos.", "Erro");
            }
        }
        if (generated) {
            JOptionPane.showMessageDialog(null, "Ao menos um arquivo foi gerado com sucesso !");
        }
    }
    
    private void valueFiles() throws Exception {
        boolean existsFiles = existsFiles();     
        if (!existsFiles) throw new Exception("Arquivos não encontrados. Por favor, crie-os primeiro."); 
        valuesForFiles = new int[3];
        isValue = true;
        cancelOperation = false;
        new JOptionPaneMultiInput().setVisible(true);
        if (cancelOperation) return;
        if (!isValue) throw new Exception("Digite apenas números inteiros"); 
        int[] allNumbers = RandomNumbers.getRandomNumbersInRange(valuesForFiles[0], valuesForFiles[1], valuesForFiles[2]);
        String values = "";
        for (int value : allNumbers) {
            values += value + "\n";
        }
        try{
            for (File file : files) {
                FileWriter writer = new FileWriter(file.getName());
                writer.write(values);
                writer.close();
            }
            JOptionPane.showMessageDialog(null, "Conteúdo dos arquivos alterado com sucesso !");
        }
        catch (Exception e) {
            new Error("Não foi possível preencher os arquivos", "Erro");
        }
    }
    
    static public boolean existsFiles() {
        if (files.size() < Main.algorithms.size()) return false;
        boolean existsFiles = true;
        for (File file : files) {
            if (!file.exists() || file.isDirectory()) {
                existsFiles = false;
                break;
            }
        }
        return existsFiles;
    }
}
