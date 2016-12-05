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
public class benchPlayer extends player {
    int mSkill;
    
    public benchPlayer() {
        super(generateSkills());
    }
    
    private static int generateSkills() {
        return intUtils.getRandomNumBetween(50, 80);
    }
}
