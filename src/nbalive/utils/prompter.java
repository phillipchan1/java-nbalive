/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbalive.utils;
import java.util.Scanner;

/**
 *
 * @author phillipchan
 */
public class prompter {
    
    Scanner scanner = new Scanner(System.in);
    
    public String ask(String question) {
        System.out.printf(question + "\n");
        String answer = scanner.nextLine();
        
        return answer;
    }
}
