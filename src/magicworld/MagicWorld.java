/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicworld;

import CreacionCharacters.Director;
import Personajes.Equipment.Armory;

/**
 *
 * @author USERS
 */
public class MagicWorld {

    /**
     * @param args the command line arguments
     */
    public static Armory armory = Armory.getInstance();
    public static Director director = new Director();

    public static void main(String[] args) {
        armory.addFront("helmet1", "example of helmet", 1, 2);
        Voice voz = new Voice();
        String texto = voz.LeerTXT("src/txt/Wellcome.txt");
        System.out.println(texto.replace(".", ".\n"));
        voz.speak(texto);
        texto = voz.LeerTXT("src/txt/Intro.txt");
        System.out.println(texto.replace(".", ".\n"));
        voz.speak(texto);
    }

}
