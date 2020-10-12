package helpers;

import algorithms.BubbleSort;
import io.FileIO;

public class ExecuteAlgorithms {
    public ExecuteAlgorithms() {
        if (FileIO.existsFiles()) {
            int[] teste = {1, 2, 5, 1, 10, 10, 1, 1, 1, 1, 2, 10, 1};
            BubbleSort bubbleSort = new BubbleSort(teste);
            for (int i : teste) {
                System.out.println(i);
            }
            System.out.println("bubbleSort.getName() " + bubbleSort.getName());
            System.out.println("bubbleSort.getMillisecondsPassed() " + bubbleSort.getMillisecondsPassed());
        }
        else {
            new customPanes.Error("Os arquivos referentes aos algoritmos não existem", "Erro");
        }
    }
}
