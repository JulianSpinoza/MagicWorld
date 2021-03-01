package Personajes.Equipment;

public class Front extends Equipment {

    public float weight;

    public Front(String name, String description, float weight, float defenseMultiplier) {
        super(name, description);
        this.weight = weight;
        this.multiplier = defenseMultiplier;
    }

}
