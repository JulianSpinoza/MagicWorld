/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Personajes.TypeElement.Element;

/**
 *
 * @author USERS
 */
public class Enemy extends Personaje{

    //Methods
    public Enemy(int lvl){
        this.health = 50*lvl;
    }
    
    public void changePattern(float health){
        
    }
    
    public float getHealth(){
        return this.health;
    }
    
    @Override
    public void attack(Element element, float multiplier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
