/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Personajes.Equipment.Equipment;
import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;
import Team.Team;

/**
 *
 * @author USERS
 */
public abstract class Personaje implements Team {

    //Attributes
    protected float baseDamage;
    protected double health;
    protected float defense;
    protected float criticalRate;
    protected int level;
    public Equipment[] equipment = new Equipment[3];

    //Methods
    public abstract void attack(Element escenario, Role enemigo, double multiplier);
    
    public void setLevel(int lvl){
        this.level=lvl;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public double getHealth() {
        return this.health;
    }

    public void setHealth(double newHealth) {
        this.health = newHealth;
    }
    
    public void restaurarVida(){
        this.health=300*this.level;
    }
    
}
