package CreacionCharacters;

import Personajes.TypeHero.Role;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Director {

    public Role createArcher(int lvl, BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon) {
        builder.setCategoryAndElement(1, typeElement);
        //builder.reset();
        if (nameFront != null) {
            builder.setFront(nameFront);
        }
        if (nameHelmet != null) {
            builder.setHelmet(nameHelmet);
        }
        if (nameWeapon != null) {
            builder.setWeapon(nameWeapon);
        }
        builder.setLevel(lvl);
        return builder.getFinal();

    }

    public Role createSwordMan(int lvl, BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon) {
        builder.setCategoryAndElement(3, typeElement);
        //builder.reset();
        if (nameFront != null) {
            builder.setFront(nameFront);
        }
        if (nameHelmet != null) {
            builder.setHelmet(nameHelmet);
        }
        if (nameWeapon != null) {
            builder.setWeapon(nameWeapon);
        }
        builder.setLevel(lvl);
        return builder.getFinal();

    }

    public Role createWizard(int lvl, BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon) {
        builder.setCategoryAndElement(2, typeElement);
        //builder.reset();
        if (nameFront != null) {
            builder.setFront(nameFront);
        }
        if (nameHelmet != null) {
            builder.setHelmet(nameHelmet);
        }
        if (nameWeapon != null) {
            builder.setWeapon(nameWeapon);
        }
        builder.setLevel(lvl);
        return builder.getFinal();

    }

}
