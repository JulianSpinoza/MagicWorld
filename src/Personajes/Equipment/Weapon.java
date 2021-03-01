package Personajes.Equipment;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Weapon extends Equipment {

    public Weapon(String name, String description, double attackMultiplier) {
        super(name, description);
        this.multiplier = attackMultiplier;
    }

}
