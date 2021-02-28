/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;

/**
 *
 * @author USERS
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
