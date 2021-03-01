package Personajes;

import Personajes.Equipment.Equipment;
import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;
import Team.Team;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public abstract class Personaje implements Team {

    //Attributes
    public float baseDamage;
    protected double health;
    public float defense;
    protected float criticalRate;
    protected int level;
    public Equipment[] equipment = new Equipment[3];

    //Methods
    public abstract void attack(Element escenario, Role enemigo, double multiplier);

    public void setLevel(int lvl) {
        this.level = lvl;
        this.defense += (lvl*50);
    }

    public int getLevel() {
        return this.level;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double newHealth) {
        this.health = newHealth;
    }

    public void restaurarVida() {
        this.health = 300 * this.level;
    }

}
