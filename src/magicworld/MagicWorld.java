/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicworld;

import Personajes.Player;
import java.io.File;
import java.net.URL;

/**
 *
 * @author USERS
 */
public class MagicWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voice voz = new Voice(); 
        String dir = new File ("src/txt/Wellcome.txt").getAbsolutePath();
        System.out.println(voz.LeerTXT(dir));
        voz.speak(voz.LeerTXT(dir));
        Player jugador = new Player();
        Memento states = new Memento();
        states.createState(1, jugador);
        new Combat(1, jugador);
    }
 
}
