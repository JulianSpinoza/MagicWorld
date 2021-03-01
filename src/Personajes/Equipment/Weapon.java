package Personajes.Equipment;

public class Weapon extends Equipment {

    public Weapon(String name, String description, double attackMultiplier) {
        super(name, description);
        this.multiplier = attackMultiplier;
    }

}
