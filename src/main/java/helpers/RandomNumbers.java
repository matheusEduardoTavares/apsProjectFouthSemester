package helpers;

import java.util.Random;

public class RandomNumbers {    
    public static int[] getRandomNumbersInRange(int min, int max, int quantity) {
        int maior = min > max ? min : max;
        int menor = min > max ? max : min;
        Random r = new Random();
        int[] allNumbers = new int[quantity];
	for (int i = 0; i < quantity; i++) {
            allNumbers[i] = r.nextInt((maior - menor) + 1) + menor;
        }
        return allNumbers;
    }
}
