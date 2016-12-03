/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbalive;
import nbalive.utils.prompter;

/**
 *
 * @author phillipchan
 */
public class NBALive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gameStatus gameStatus = new gameStatus();
        
        while (gameStatus.checkStatus()) {
            gameStatus.questionRouter();
        }    
    }
    
}
