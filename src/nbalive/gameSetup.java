/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbalive;
import java.util.List;
import nbalive.players.player;
import nbalive.utils.prompter;
import nbalive.teams.team;

/**
 *
 * @author phillipchan
 */

public class gameSetup {
    prompter prompter = new prompter();
    
    public String getName() {
        String name = prompter.ask("what is your name?");
        System.out.printf("Hi %s \n", name);
        System.out.printf("Let' see up your team \n");
        
        return name;
    }
    
    public team buildTeam() {
        String teamName = prompter.ask("What is the team name?");
        team team = new team(teamName);
        
        System.out.printf("The team name is %s and your mascot is a %s \n", team.getName(), team.getMascot());
        
        System.out.printf("Players on the team are:");
        
        player[] players = team.getPlayers();
        
        for (int i = 0; i < players.length; i++) {
            System.out.printf(players[i].getName() + ", Score: " + players[i].getSkill() +  ",\n");
        }
        
        System.out.printf("\n");
        
        System.out.printf("And the team score is " + team.getTeamScore() + "\n");
        
        return team;
    }
}