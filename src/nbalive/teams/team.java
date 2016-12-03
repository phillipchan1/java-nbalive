/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbalive.teams;
import java.util.*;

import nbalive.utils.intUtils;
import nbalive.players.player;


/**
 *
 * @author phillipchan
 */
public class team {
    private String mTeamName = "";
    private String mMascot = "";
    private int teamScore;
    private final int teamSize = 5;
    player[] players = new player[teamSize];
    private String[] mascotArray = {"bear", "cat", "dolphin"};
    
    // constructor - make a new team
    public team(String name) {
        mTeamName = name;
        mMascot = generateMascot();
        putPlayersOnTeam();
    }
    
    public void putPlayersOnTeam() {
        for (int i = 0; i < teamSize; i++) {
            players[i] = new player();
        }
    }
    
    public int getTeamScore() {
        int score = 0;
        for (int i = 0; i < players.length; i++) {
            score = score + players[i].getSkill();
        }
        
        return score;
    }
    
    public String getName() {
        return mTeamName;
    }
    
    public String getMascot() {
        return mMascot;
    }
    
    public player[] getPlayers() {
        return players;
    }
    
    public final String generateMascot() {
        int randomIndex = intUtils.getRandomNumBetween(0, mascotArray.length);
        
        return mascotArray[randomIndex];
    }
}
