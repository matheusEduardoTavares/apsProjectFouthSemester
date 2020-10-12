package main;
import io.FileIO;
import java.util.ArrayList;
import ui.Menu;

public class Main {
    static public ArrayList<Object> algorithms = new ArrayList<Object>();
    
    public static void main(String[] args) {
        FileIO.getFilesPath("src/main/java/algorithms", ".java", true, algorithms);
        for (int i = 0; i < algorithms.size(); i++) {
            int indexPoint = algorithms.get(i).toString().indexOf(".");
            String nameFileWithoutExtension = algorithms.get(i).toString().substring(0, indexPoint);
            algorithms.set(i, nameFileWithoutExtension);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
