package helpers;

import algorithms.BubbleSort;
import io.FileIO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ExecuteAlgorithms {
    public static Map<String, Integer> indexForAlgorithms;
    public static ArrayList<Integer[]> valuesForAlgorithms;
    
    public ExecuteAlgorithms() {
        indexForAlgorithms = new HashMap<String, Integer>();
        valuesForAlgorithms = new ArrayList<Integer[]>();
        FileIO.counter = 0;
        if (FileIO.existsFiles()) {
            if (FileIO.containsOnlyNumbers()) {
                
                //Bubble Sort
                String nameAlgorithm = "BubbleSort";
                BubbleSort bubbleSort = new BubbleSort(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)));
                for (int i : valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm))) {
                    System.out.println(i);
                }
                System.out.println("bubbleSort.getName() " + bubbleSort.getName());
                System.out.println("bubbleSort.getMillisecondsPassed() " + bubbleSort.getMillisecondsPassed());
                
                int index = FileIO.indexFile(nameAlgorithm);
                if (index >= 0) {
                    FileIO.writeFile(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)), index);
                }
                else {
                    new customPanes.Error("O algoritmo BubbleSort não foi encontrado", "Erro");
                }
                
                JOptionPane.showMessageDialog(null, "Todos os arquivos foram ordenados e salvados com sucesso !");
            }
        }
        else {
            new customPanes.Error("Os arquivos referentes aos algoritmos não existem", "Erro");
        }
    }
}
