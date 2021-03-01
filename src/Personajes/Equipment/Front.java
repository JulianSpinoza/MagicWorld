package Personajes.Equipment;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Front extends Equipment {

    public double weight;

    public Front(String name, String description, double weight, double defenseMultiplier) {
        super(name, description);
        this.weight = weight;
        this.multiplier = defenseMultiplier;
    }

}
