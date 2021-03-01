package Personajes;

import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Enemy extends Personaje {

    //Methods
    public Enemy() {
        this.health = 50 * this.level;
    }

    public void changePattern(float health) {

    }

    @Override
    public void attack(Element escenario, Role enemigo, double multiplier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
