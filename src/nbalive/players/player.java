/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbalive.players;
import nbalive.utils.intUtils;
/**
 *
 * @author phillipchan
 */
public class player {
    private String[] playerNameList = {"joe", "phil", "kobe", "lebron", "steph", "jordan", "hakeem", "barkley"};
    private String mName = "";
    private String age = "";
    private int mSkill;
    
    public player() {
        age = String.valueOf(intUtils.getRandomNumBetween(19, 34));
        mSkill = intUtils.getRandomNumBetween(0, 100);
        mName = getRandomPlayer();
    }
    
    public String getName() {
        return mName;
    }
    
    public int getSkill() {
        return mSkill;
    }
    
    private String getRandomPlayer() {
        int randomIndex = intUtils.getRandomNumBetween(0, playerNameList.length);
        return playerNameList[randomIndex];
    }
}
