package Personajes.Equipment;

public class Weapon extends Equipment {

    public Weapon(String name, String description, float attackMultiplier) {
        super(name, description);
        this.multiplier = attackMultiplier;
    }

}
