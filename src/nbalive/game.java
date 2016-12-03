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
public class game {
    public static void playGame(team teamOne, team teamTwo) {
        int teamOneScore = teamOne.getTeamScore();
        int teamTwoScore = teamTwo.getTeamScore();
        String winner;
        
        if (teamOneScore > teamTwoScore) {
            winner = teamOne.getName();
        } else {
            winner = teamTwo.getName();
        }
        
        System.out.printf(winner + " wins!");
    }
}
