package magicworld;

import CreacionCharacters.BuilderEnemy;
import Personajes.*;
import Personajes.TypeElement.*;
import Personajes.TypeHero.Role;
import Team.Group;
import java.util.ArrayList;
import java.util.Iterator;

public class Combat {

    public Combat(int combat, Role jugador) {
        String texto;
        Element elemento = null;
        double multiplier = 1.3;
        Group enemigos = new Group();
        BuilderEnemy enemyBuilder = new BuilderEnemy();
        elemento = new Fire();
        switch (combat) {
            /*
            1:Fuego
            2:Agua
            3:Tierra
            4:Viento
             */
            //Introduccion
            case 0:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_0.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(1, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 1:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_1.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(1, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(1, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 2:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_2.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(2, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(1, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 3:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_3.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(3, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(2, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(2, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 4:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_4.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(3, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 5:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_5.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(5, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 6:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_6.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(5, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(5, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 7:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_7.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(7, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(7, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 8:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_8.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 9:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_9.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(9, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(9, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(9, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(9, enemyBuilder, 1, null, "helmet1", null));
                break;
            case 10:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_10.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(9, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(9, enemyBuilder, 1, null, "helmet1", null));
                break;
            //FINAL BOSS
            case 11:
                //texto = MagicWorld.voz.LeerTXT("src/txt/combat_11.txt");
                //System.out.println(texto.replace(".", ".\n"));
                //MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, null, "helmet1", null));
                enemigos.add(MagicWorld.director.createArcher(12, enemyBuilder, 1, null, "helmet1", null));
                break;
            default:
                System.out.println(combat);
        }
        while (!winner(jugador, enemigos)) {
            ArrayList<Role> enemy = enemigos.getCharacters();
            System.out.println("La vida del jugador es: " + jugador.character.getHealth());
            System.out.println("La defensa del jugador es: " + jugador.character.defense);
            System.out.println("El daño base es: " + jugador.character.baseDamage);
            for (int i = 0; i < enemy.size(); i++) {
                System.out.println("index: " + i + " Enemigo: " + mostrarStats(enemy.get(i)));
            }
            System.out.println("Escoje al enemigo que deseas atacar");
            int y = MagicWorld.sc.nextInt();
            jugador.attack(elemento, enemigos.getCharacter(y), multiplier);
            System.out.println("\nEl jugador atacó");
            for (int i = 0; i < enemy.size(); i++) {
                Role enemigo = enemy.get(i);
                if (enemigo.character.getHealth() > 0) {
                    enemy.get(i).attack(elemento, jugador, multiplier);
                    System.out.println("\nEl enemigo atacó");
                }
            }
        }
        if (jugador.character.getHealth() > 0) {
            jugador.character.setLevel(jugador.character.getLevel() + 1);
            jugador.character.restaurarVida();
            System.out.println("Gano!");
        } else {
            jugador.character.restaurarVida();
            System.out.println(jugador.character.getHealth());
            System.out.println("Perdio!");
        }
        System.out.println("Combate finalizado");

    }

    private boolean winner(Role jugador, Group enemigos) {
        if (jugador.character.getHealth() < 0) {
            return true;
        } else {
            ArrayList<Role> enemy = enemigos.getCharacters();
            int remaining = 0;
            for (int i = 0; i < enemy.size(); i++) {
                remaining++;
                if (enemy.get(i).character.getHealth() <= 0) {
                    remaining--;
                }
            }
            if (remaining == 0) {
                return true;
            }
        }
        return false;
    }

    private String mostrarStats(Role enemy) {
        String stats;
        stats = "La vida del enemigo es: " + enemy.character.getHealth() + " y su elemeneto es: " + enemy.element.getName();
        return stats;
    }
}
