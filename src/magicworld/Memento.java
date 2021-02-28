/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicworld;

import Personajes.Player;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author k0garashi
 */
public class Memento {
    Map<Integer, Player> states = new HashMap<Integer, Player>();
    public void createState(int lvl, Player jugador){
        states.put(lvl, jugador.clonar());
    }
    public Player getState(int lvl){
        return states.get(lvl);
    }
}
