/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Personajes.Personaje;
import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USERS
 */
public class Player extends Personaje implements Cloneable {

    //Attributes
    private String nickname;
    private Amulet[] amuleto;

    //Methods
    public void changeEquipment() {

    }

    @Override
    public void attack(Element escenario, Role enemigo, double multiplier) {

    }

    public Player clonar() {
        try {
            return (Player) this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
