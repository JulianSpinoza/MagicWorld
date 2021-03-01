package Personajes.Equipment;

import java.util.ArrayList;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Armory {

    private static Armory instance;
    public ArrayList<Front> front = new ArrayList<Front>();
    public ArrayList<Helmet> helmet = new ArrayList<Helmet>();
    public ArrayList<Weapon> weapon = new ArrayList<Weapon>();

    private Armory() {
        addFront("Pechera básica", "Pechera inicial", 1, 1.5);
        addFront("Pechera imperial", "Pechera hecha de los imperios", 1.5, 2);
        addFront("Pechera éterea", "Pechera forjada entre los dos mundo", 1, 3);
        addHelmet("Casco básico", "Casco inicial", 1.2);
        addHelmet("Casco imperial", "Casco hecha de los imperios", 1.5);
        addHelmet("Casco éterea", "Casco forjada entre los dos mundo", 2);
        addWeapon("Arma básica", "Arma inicial", 1.3);
        addWeapon("Arma imperial", "Arma hecha de los imperios", 1.7);
        addWeapon("Arma éterea", "Arma forjada entre los dos mundo", 2.5);
    }

    public static Armory getInstance() {
        if (instance == null) {
            instance = new Armory();
        }
        return instance;
    }

    public void addFront(String name, String description, double weightLb, double defenseMultiplier) {
        front.add(new Front(name, description, weightLb, defenseMultiplier));
    }

    public void addHelmet(String name, String description, double defenseMultiplier) {
        helmet.add(new Helmet(name, description, defenseMultiplier));
    }

    public void addWeapon(String name, String description, double attackMultiplier) {
        weapon.add(new Weapon(name, description, attackMultiplier));
    }

    public Equipment search(String typeEquipment, String name) {
        switch (typeEquipment) {
            case "Front":
                for (Front actualFront : front) {
                    if (actualFront.name.equals(name)) {
                        return actualFront;
                    }
                }
                break;
            case "Helmet":
                for (Helmet actualHelmet : helmet) {
                    if (actualHelmet.name.equals(name)) {
                        return actualHelmet;
                    }
                }
                break;
            case "Weapon":
                for (Weapon actualWeapon : weapon) {
                    if (actualWeapon.name.equals(name)) {
                        return actualWeapon;
                    }
                }
                break;
        }

        return null;
    }

}
