package Personajes.Equipment;

import Personajes.Equipment.Equipment;

public class Weapon extends Equipment{
    
    public float attackMultiplier;

    public Weapon(String name, String description, float attackMultiplier) {
        super(name, description);
        this.attackMultiplier = attackMultiplier;
    }
    
}
