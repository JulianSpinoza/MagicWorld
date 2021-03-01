package Personajes.Equipment;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Helmet extends Equipment {

    public Helmet(String name, String description, double defenseMultiplier) {
        super(name, description);
        this.multiplier = defenseMultiplier;
    }

}
