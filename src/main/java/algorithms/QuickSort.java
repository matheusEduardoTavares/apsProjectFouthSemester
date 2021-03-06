package algorithms;

public final class QuickSort {
    private long millisecondsPassed;
    private String name;
    private int numberComparisons = 0;
    
    public QuickSort(Integer[] array) {
        name = "QuickSort";
        long startMilliseconds = System.currentTimeMillis();
        quicksort(array, 0, array.length - 1);
        long finishMilliseconds = System.currentTimeMillis();
        millisecondsPassed = finishMilliseconds - startMilliseconds;
    }
    
    public void quicksort(Integer[] vetor, int esq, int dir) {
        if (esq < dir) {
            int j = separar(vetor, esq, dir); 
            quicksort(vetor, esq, j - 1); 
            quicksort(vetor, j + 1, dir);
        }
    }
    
    private int separar(Integer[] vetor, int esq, int dir) {
        int i = esq + 1; 
        int j = dir; 
        int pivo = vetor[esq]; 
        while (i <= j) { 
            this.numberComparisons++;
            if (vetor[i] <= pivo) {
                i++; 
            } else if (vetor[j] > pivo) {
                j--; 
            } else if (i <= j) { 
                trocar(vetor, i, j);
                i++;
                j--;
            }
        }
        trocar(vetor, esq, j);
        return j;
    }
    
    private void trocar(Integer[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
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
