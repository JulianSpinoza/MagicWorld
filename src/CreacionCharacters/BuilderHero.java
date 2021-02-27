/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

import Personajes.Player;
import Personajes.Character;

/**
 *
 * @author USERS
 */
public class BuilderHero implements BuilderCharacter {
    
    private Character hero;

    public BuilderHero(){
        this.reset();
    }
    
    @Override
    public void reset() {
        this.hero = new Player();
    }

    @Override
    public void setCategory(int type) {
        
    }

    @Override
    public void setElement(int type) {
        
    }
    
    public Character getFinalHero(){
        Character finalHero = this.hero;
        reset();
        return finalHero;
    }
    
}
