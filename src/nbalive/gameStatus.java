/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbalive;
import nbalive.teams.team;

/**
 *
 * @author phillipchan
 */
public class gameStatus {
    private static boolean gameOn = true;
    private String status = "init";
    team yourTeam;
    team opposingTeam;
        
    public static Boolean checkStatus() {
        return gameOn;
    }
    
    private void turnOff() {
        System.out.printf("goodbye");
        gameOn = false;
    }
    
    public void questionRouter() {
        gameSetup gameSetup = new gameSetup();
        
        
        if (status == "init") {
            gameSetup.getName();
            yourTeam = gameSetup.buildTeam();
            status = "teamBuilt";
        }
        
        else if (status == "teamBuilt") {
            System.out.printf("Let's build the opposing team now \n");
            opposingTeam = gameSetup.buildTeam();
            status = "playGame";
        } 
        
        else if (status == "playGame") {
            System.out.printf("Let's play a game!! \n\n");
            game.playGame(yourTeam, opposingTeam);
            status = "done";
        } else {
            turnOff();
        }
    }
}
