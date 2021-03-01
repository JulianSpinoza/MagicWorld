package Personajes.Equipment;

public class Front extends Equipment {

    public double weight;

    public Front(String name, String description, double weight, double defenseMultiplier) {
        super(name, description);
        this.weight = weight;
        this.multiplier = defenseMultiplier;
    }

}
