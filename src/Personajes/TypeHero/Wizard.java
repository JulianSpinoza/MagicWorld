package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Wizard extends Role {

    public Wizard(Personaje typeCharacter, Element typeElement) {
        super(typeCharacter, typeElement);
        this.baseDamage = 206;
        this.defense=10;
    }

    @Override
    public void attack(Element escenario, Role enemigo, double multiplier) {
        if (this.element.getName().equals(escenario.getName())) {
            this.element.setElementalDamage(this.element.getElementalDamage() * multiplier);
        }
        if (this.element.getName().equals("Fuego")) {
            switch (enemigo.element.getName()) {
                case "Fuego":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                case "Agua":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.5);
                    break;
                case "Tierra":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.8);
                    break;
                case "Viento":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                default:
                    break;
            }
        }
        if (this.element.getName().equals("Agua")) {
            switch (enemigo.element.getName()) {
                case "Fuego":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                case "Agua":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                case "Tierra":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1.3);
                    break;
                case "Viento":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.7);
                    break;
                default:
                    break;
            }
        }
        if (this.element.getName().equals("Tierra")) {
            switch (enemigo.element.getName()) {
                case "Fuego":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                case "Agua":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.7);
                    break;
                case "Tierra":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                case "Viento":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0);
                    break;
                default:
                    break;
            }
        }
        if (this.element.getName().equals("Viento")) {
            switch (enemigo.element.getName()) {
                case "Fuego":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 0.7);
                    break;
                case "Agua":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1.5);
                    break;
                case "Tierra":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 2);
                    break;
                case "Viento":
                    this.element.setElementalDamage(this.element.getElementalDamage() * 1);
                    break;
                default:
                    break;
            }
        }
        System.out.print("Lanzando hechizo de " + this.element.getName() + " y se hizo un daño de " + (this.baseDamage + this.element.getElementalDamage()) + " puntos");
        enemigo.character.setHealth(enemigo.character.getHealth() - (this.baseDamage + this.element.getElementalDamage()));
    }

    @Override
    public Element getElement() {
        return this.element;
    }

}
