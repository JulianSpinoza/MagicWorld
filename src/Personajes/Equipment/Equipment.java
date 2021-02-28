package Personajes.Equipment;

import Personajes.Personaje;

public abstract class Equipment {
    
    public float stats[];
    protected Personaje character;
    public String name;
    public String description;
    
    public void equip(Personaje toEquip){
        character = toEquip;
    }

    
}
