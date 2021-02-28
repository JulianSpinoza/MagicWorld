package Personajes.Equipment;

import Personajes.Personaje;

public abstract class Equipment {
    
    protected Personaje character;
    public String name;
    public String description;
    
    public Equipment(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public void equip(Personaje toEquip){
        character = toEquip;
    }

    
}
