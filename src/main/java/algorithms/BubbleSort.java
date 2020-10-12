package algorithms;

public class BubbleSort {
    private long millisecondsPassed;
    private String name;

    public BubbleSort(Integer[] array){
        name = "Bubble Sort";
        long startMilliseconds = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++){
            for (int pos = 0; pos < array.length - 1; pos++) {
                if (array[pos] > array[pos + 1]) {         
                    int aux = array[pos];
                    array[pos] = array[pos + 1];
                    array[pos + 1] = aux;
                }   
            }
        }
        long finishMilliseconds = System.currentTimeMillis();
        millisecondsPassed = finishMilliseconds - startMilliseconds;
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
