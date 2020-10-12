/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.Random;

/**
 *
 * @author mateus
 */
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
