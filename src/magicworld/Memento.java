/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicworld;

import Personajes.Player;
import Personajes.TypeHero.Role;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author k0garashi
 */
public class Memento implements Cloneable{

    Map<Integer, Role> states = new HashMap<Integer, Role>();

    public void createState(int lvl, Role jugador) {
        states.put(lvl, jugador.clonar());
    }

    public Role getState(int lvl){
        return (Role) states.get(lvl).clonar();
    }
}
