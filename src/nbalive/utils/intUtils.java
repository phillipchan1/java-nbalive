/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbalive.utils;
import java.util.Random;

/**
 *
 * @author phillipchan
 */
public class intUtils {
    public static int getRandomNumBetween(int min, int max) {
        Random ran = new Random();
        
        int randomNumber = ran.nextInt(max - min) + min;
        
        if (randomNumber == min) {
            return min + 1;
        } else {
            return randomNumber;
        }
    }
}
