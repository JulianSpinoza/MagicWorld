/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

import Personajes.Personaje;
import Personajes.TypeHero.Role;

/**
 *
 * @author USERS
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

    public Role createSwordMan(int lvl,BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon) {
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

    public Role createWizard(int lvl,BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon) {
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
