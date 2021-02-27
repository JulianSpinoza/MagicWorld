/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

import Personajes.Enemy;
import Personajes.Character;

/**
 *
 * @author USERS
 */
public class BuilderEnemy implements BuilderCharacter {
    
    private Character enemy;

    public BuilderEnemy(){
        this.reset();
    }
    
    @Override
    public void reset() {
        this.enemy = new Enemy();
    }

    @Override
    public void setCategory(int type) {
        
    }

    @Override
    public void setElement(int type) {
        
    }
    
    public Character getFinalEnemy(){
        Character finalEnemy = this.enemy;
        reset();
        return finalEnemy;
    }
    
}
