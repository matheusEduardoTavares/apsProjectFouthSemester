package algorithms;

public class SelectionSort {
    private long millisecondsPassed;
    private String name;
    
    public SelectionSort(Integer[] array) {
        name = "SelectionSort";
        long startMilliseconds = System.currentTimeMillis();
        selectionSort(array);
        long finishMilliseconds = System.currentTimeMillis();
        millisecondsPassed = finishMilliseconds - startMilliseconds;
    }
    
    private static void selectionSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int menor = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[menor]) 
                    menor = j;   
            }
            trocar(array, i, menor);
        }
    }
    
    private static void trocar(Integer[] array, int i, int menor) {
        int aux = array[i];
        array[i] = array[menor];
        array[menor] = aux;
    }

    public long getMillisecondsPassed() {
        return millisecondsPassed;
    }

    public void setMillisecondsPassed(long millisecondsPassed) {
        this.millisecondsPassed = millisecondsPassed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
