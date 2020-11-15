package algorithms;

public class InsertionSort {
    private long millisecondsPassed;
    private String name;
    private int numberComparisons = 0;
    
    public InsertionSort(Integer[] array) {
        name = "InsertionSort";
        long startMilliseconds = System.currentTimeMillis();
        insertionSort(array);
        long finishMilliseconds = System.currentTimeMillis();
        millisecondsPassed = finishMilliseconds - startMilliseconds;
    }
    
    private void insertionSort(Integer[] array) { 
        int n = array.length; 
        for (int i = 1; i < n; ++i) { 
            int key = array[i]; 
            int j = i - 1; 
            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
                this.numberComparisons++;
            } 
            array[j + 1] = key; 
        } 
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

    public int getNumberComparisons() {
        return numberComparisons;
    }

    public void setNumberComparisons(int numberComparisons) {
        this.numberComparisons = numberComparisons;
    }
}
