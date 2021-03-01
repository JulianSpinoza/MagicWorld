package Personajes.Equipment;

import Personajes.Personaje;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public abstract class Equipment {

    protected Personaje character;
    public String name;
    public String description;
    public double multiplier;

    public Equipment(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void equip(Personaje toEquip) {
        character = toEquip;
    }

}
