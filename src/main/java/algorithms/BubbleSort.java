package algorithms;

public class BubbleSort {
    private long millisecondsPassed;
    private String name;

    public BubbleSort(Integer[] numeros){
        name = "Bubble Sort";
        long startMilliseconds = System.currentTimeMillis();
        for (int i = 0; i < numeros.length - 1; i++){
            for (int pos = 0; pos < numeros.length - 1; pos++) {
                if (numeros[pos] > numeros[pos + 1]) {         
                    int aux = numeros[pos];
                    numeros[pos] = numeros[pos + 1];
                    numeros[pos + 1] = aux;
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
