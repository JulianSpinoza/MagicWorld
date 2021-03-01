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

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class MagicWorld {
    public static Armory armory = Armory.getInstance();
    public static Director director = new Director();
    public static Voice voz = new Voice();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String texto = voz.LeerTXT("src/txt/Wellcome.txt");
        System.out.println(texto.replace(".", ".\n"));
        voz.speak(texto);
        texto = voz.LeerTXT("src/txt/Intro.txt");
        System.out.println(texto.replace(".", ".\n"));
        voz.speak(texto);
        Role jugador = director.createArcher(1, new BuilderHero(), 1, "Casco básico", "Pechera éterea", "Arma imperial");
        while (jugador.character.getLevel() <= 12) {
            new Combat(jugador.character.getLevel() - 1, jugador);
        }
        System.out.println("Ganaste, gracias. Buena tarde!");
    }

}
