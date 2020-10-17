package helpers;

import io.FileIO;
import customPanes.Error;

public class GenerateGraphics {
    public GenerateGraphics() {
        generateGraphics();
    }
    
    public void generateGraphics() {
        String textTimes = "", textNames = "", partition = "";
        String[] names = ExecuteAlgorithms.names;
        long[] runtimes = ExecuteAlgorithms.runtimes;
        if (names[3] == null) {
            new Error("É necessário realizar pelo menos uma ordenação para poder gerar gráficos", "Erro");
        }
        else {
            for (int i = 0; i < names.length; i++) {
                textTimes += runtimes[i] + ",";
                textNames += "\'" + names[i] + "\'" + ",";
            }
            textTimes = textTimes.substring(0, textTimes.length() - 1);
            textNames = textNames.substring(0, textNames.length() - 1);
            String messageToGraphics = "python3 algoritmos.py " + textTimes + " " + textNames;

            String path = FileIO.getPath("src/main/java/algorithms");
            
            partition = path.substring(0, 1);
            
            new CallPythonFile(path, messageToGraphics, partition);
        }
    }
}
