package Personajes.Equipment;

public class Helmet extends Equipment {

    public float defenseMultiplier;

    public Helmet(String name, String description, float defenseMultiplier) {
        super(name, description);
        this.defenseMultiplier = defenseMultiplier;
    }

}
