package helpers;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import customPanes.Success;
import io.FileIO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExecuteAlgorithms {
    public static Map<String, Integer> indexForAlgorithms;
    public static ArrayList<Integer[]> valuesForAlgorithms;
    public static long[] runtimes = new long[4];
    public static String[] names = new String[4];
    
    
    public ExecuteAlgorithms() {
        indexForAlgorithms = new HashMap<String, Integer>();
        valuesForAlgorithms = new ArrayList<Integer[]>();
        
        FileIO.counter = 0;
        if (FileIO.existsFiles()) {
            if (FileIO.containsOnlyNumbers()) {
                
                //Quick Sort
                String nameAlgorithm = "QuickSort";
                QuickSort quickSort = new QuickSort(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)));
                runtimes[0] = quickSort.getMillisecondsPassed();
                names[0] = quickSort.getName();
                
                int index = FileIO.indexFile(nameAlgorithm);
                if (index >= 0) {
                    FileIO.writeFile(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)), index, quickSort.getName());
                }
                else {
                    new customPanes.Error("O algoritmo QuickSort não foi encontrado", "Erro");
                }
                System.out.println("Número de comparações do " + quickSort.getName() + " = " + quickSort.getNumberComparisons());
                
                //Bubble Sort
                nameAlgorithm = "BubbleSort";
                BubbleSort bubbleSort = new BubbleSort(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)));
                runtimes[1] = bubbleSort.getMillisecondsPassed();
                names[1] = bubbleSort.getName();
                
                index = FileIO.indexFile(nameAlgorithm);
                if (index >= 0) {
                    FileIO.writeFile(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)), index, bubbleSort.getName());
                }
                else {
                    new customPanes.Error("O algoritmo BubbleSort não foi encontrado", "Erro");
                }
                System.out.println("Número de comparações do " + bubbleSort.getName() + " = " + bubbleSort.getNumberComparisons());
                
                //Insertion Sort
                nameAlgorithm = "InsertionSort";
                InsertionSort insertionSort = new InsertionSort(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)));
                runtimes[2] = insertionSort.getMillisecondsPassed();
                names[2] = insertionSort.getName();
                
                index = FileIO.indexFile(nameAlgorithm);
                if (index >= 0) {
                    FileIO.writeFile(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)), index, insertionSort.getName());
                }
                else {
                    new customPanes.Error("O algoritmo insertionSort não foi encontrado", "Erro");
                }
                System.out.println("Número de comparações do " + insertionSort.getName() + " = " + insertionSort.getNumberComparisons());
                
                //Selection Sort
                nameAlgorithm = "SelectionSort";
                SelectionSort selectionSort = new SelectionSort(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)));
                runtimes[3] = selectionSort.getMillisecondsPassed();
                names[3] = selectionSort.getName();
                
                index = FileIO.indexFile(nameAlgorithm);
                if (index >= 0) {
                    FileIO.writeFile(valuesForAlgorithms.get(indexForAlgorithms.get(nameAlgorithm)), index, selectionSort.getName());
                }
                
                else {
                    new customPanes.Error("O algoritmo selectionSort não foi encontrado", "Erro");
                }
                
                String messageJavaTime = "";
                for (int i = 0; i < names.length; i++) {
                    messageJavaTime += "\n" + "O algoritmo " + names[i] + " levou " + runtimes[i] + " milissegundo(s) para ordenação !";
                }
                System.out.println("Número de comparações do " + selectionSort.getName() + " = " + selectionSort.getNumberComparisons());
  
                new Success(("Todos os arquivos foram ordenados e salvados com sucesso !" + messageJavaTime), "Mensagem");
            }
        }
        else {
            new customPanes.Error("Os arquivos referentes aos algoritmos não existem", "Erro");
        }
    }
}
