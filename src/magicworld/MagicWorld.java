/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicworld;

import CreacionCharacters.BuilderHero;
import CreacionCharacters.Director;
import Personajes.Equipment.Armory;
import Personajes.TypeHero.Role;
import java.util.Scanner;

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
    public static Voice voz = new Voice();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        armory.addFront("helmet1", "example of helmet", 1, 2);
        String texto = voz.LeerTXT("src/txt/Wellcome.txt");
        System.out.println(texto.replace(".", ".\n"));
        //voz.speak(texto);
        texto = voz.LeerTXT("src/txt/Intro.txt");
        System.out.println(texto.replace(".", ".\n"));
        //voz.speak(texto);
        Role jugador = director.createArcher(1, new BuilderHero(), 1, null, "helmet1", null);
        while (jugador.character.getLevel() <= 12) {
            new Combat(jugador.character.getLevel() - 1, jugador);
        }
        System.out.println("Ganaste, gracias. Buena tarde!");
    }

}
