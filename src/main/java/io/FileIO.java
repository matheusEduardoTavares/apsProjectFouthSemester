package io;

import customPanes.JOptionPaneMultiInput;
import customPanes.Error;
import helpers.ExecuteAlgorithms;
import helpers.RandomNumbers;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFrame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import main.Main;

public class FileIO extends JFrame {
    public static ArrayList<File> files = new ArrayList<File>();
    public static int[] valuesForFiles = new int[3];
    public static boolean isValue;
    public static boolean cancelOperation;
    public static int counter;
    
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
        }
        confirmCreatedFiles();
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
        }
        catch (Exception e) {
            new Error("Não foi possível encontrar a pasta do projeto", "Erro");
        }
    }
    
    private void confirmCreatedFiles() {
        boolean generated = false;
        for (File file : files){
            try {
                if (file.createNewFile()) {
                  generated = true;
                } 
                else {
                  if (Main.algorithms.size() == files.size()) new Error(("Aquivo " + file.getName() + " já existe!"), "Arquivo já existente");
                }
            } catch (IOException e) {
                new Error("Não foi possível gerar os arquivos", "Erro");
            }
        }
        if (generated) {
            if (Main.algorithms.size() == files.size()) JOptionPane.showMessageDialog(null, "Ao menos um arquivo foi gerado com sucesso !");
        }
    }
    
    private void valueFiles() throws Exception {
        boolean existsFiles = existsFiles();     
        if (!existsFiles) throw new Exception("Arquivos não encontrados. Por favor, crie-os primeiro"); 
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
    
    static public boolean containsOnlyNumbers() {
        boolean existsFiles = existsFiles();     
        String filename = "";
        ArrayList<Integer> valuesFromFile;
        String nameFileWithoutExtension = "";
        if (!existsFiles) return false; 
        else {      
            try{
                for (File file : files) {
                    valuesFromFile = new ArrayList<Integer>();
                    filename = file.getName();
                    int indexPoint = filename.indexOf(".");
                    nameFileWithoutExtension = filename.substring(0, indexPoint);
                    File myObj = file;
                    try (Scanner reader = new Scanner(myObj)) {
                        while (reader.hasNextLine()) {
                            String data = reader.nextLine();
                            if (!data.equals("")) {
                                int value = Integer.parseInt(data);
                                valuesFromFile.add(value);
                            }
                        }
                        reader.close();
                    }
                    Integer[] values = new Integer[valuesFromFile.size()];
                    for (int i = 0; i < valuesFromFile.size(); i++) {
                        values[i] = valuesFromFile.get(i);
                    }
                    ExecuteAlgorithms.indexForAlgorithms.put(nameFileWithoutExtension, counter);
                    ExecuteAlgorithms.valuesForAlgorithms.add(values);
                    counter++;
                }
                return true;
            }
            catch (NumberFormatException e) {
                new Error(("O arquivo " + filename + " não contém apenas números"), "Erro");
                return false;
            }
            catch (Exception e) {
                new Error("Não foi possível ler os arquivos", "Erro");
                return false;
            }
        }
    }
    
    static public void writeFile(Integer[] data, int index, String nameAlgorithm) {
        try {
            FileWriter writer = new FileWriter(files.get(index).getName());
            String convertArrayToString = "";
            for (int value : data) {
                convertArrayToString += value + "\n";
            }
            // convertArrayToString += nameAlgorithm;
            writer.write(convertArrayToString);
            writer.close();
        }
        catch (Exception e) {
            new Error("Não foi possível armazenar a ordenação no arquivo", "Erro");
        }
    }
    
    static public int indexFile(String name) {
        String filename = "";
        int count = 0;
        for (File file : files) {
            filename = file.getName();
            int indexPoint = filename.indexOf(".");
            String nameFileWithoutExtension = filename.substring(0, indexPoint);
            if (nameFileWithoutExtension.equals(name)) return count;
            count++;
        }
        return -1;
    }
}
