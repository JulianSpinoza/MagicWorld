/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;
import Team.Team;

/**
 *
 * @author USERS
 */
public abstract class Personaje implements Team{
    
    //Attributes
    protected float baseDamage;
    protected float health;
    protected float defense;
    protected float criticalRate;
    protected int level;
    
    //Methods
    public abstract void attack(Element escenario, Element enemigo, double multiplier);
    
    public abstract float getHealth();
    
}
