/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicworld;

/**
 *
 * @author USERS
 */
public abstract class Character {
    
    //Attributes
    protected float baseDamage;
    protected float health;
    protected float defense;
    protected float criticalRate;
    protected int level;
    
    //Methods
    public abstract void attack();
    
}
