package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Archer extends Role {

    public Archer(Personaje typeCharacter, Element typeElement) {
        super(typeCharacter, typeElement);
        this.character.baseDamage = 206;
        this.character.defense=20;
        
    }

    @Override
    public void attack(Element escenario, Role enemigo, double multiplier) {
        if (this.element.getName().equals(escenario.getName())) {
            this.element.setElementalDamage(this.element.getElementalDamage() * multiplier);
        }
        if (this.element.getName().equals("Fire")) {
            switch (enemigo.element.getName()) {
                case "Fire":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                case "Water":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.5);
                    break;
                case "Earth":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.8);
                    break;
                case "Wind":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                default:
                    break;
            }
        }
        if (this.element.getName().equals("Water")) {
            switch (enemigo.element.getName()) {
                case "Fire":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                case "Water":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                case "Earth":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1.3);
                    break;
                case "Wind":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.7);
                    break;
                default:
                    break;
            }
        }
        if (this.element.getName().equals("Earth")) {
            switch (enemigo.element.getName()) {
                case "Fire":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                case "Water":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.7);
                    break;
                case "Earth":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                case "Wind":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0);
                    break;
                default:
                    break;
            }
        }
        if (this.element.getName().equals("Wind")) {
            switch (enemigo.element.getName()) {
                case "Fire":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.7);
                    break;
                case "Water":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1.5);
                    break;
                case "Earth":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                case "Wind":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                default:
                    break;
            }
        }
        double totalDamage =((this.character.baseDamage + this.element.getElementalDamage())-enemigo.character.defense);
        if(totalDamage < 0){
            System.out.print("Charging " + this.element.getName() + " arrow, with a damage of " + 0 + " points");
        } else {
            System.out.print("Charging " + this.element.getName() + " arrow, with a damage of " + totalDamage + " points");
        }
        
        double healthAfterActions = enemigo.character.getHealth() - totalDamage;
        if(healthAfterActions < 0){
            enemigo.character.setHealth(0);
        } else {
            if(totalDamage >= 0){
                enemigo.character.setHealth(healthAfterActions);
            }
        } 
    }

    @Override
    public Element getElement() {
        return this.element;
    }

}
