package Personajes.Equipment;

public class Helmet extends Equipment {

    public Helmet(String name, String description, float defenseMultiplier) {
        super(name, description);
        this.multiplier = defenseMultiplier;
    }

}
