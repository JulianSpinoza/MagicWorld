package magicworld;

import CreacionCharacters.BuilderEnemy;
import Personajes.TypeElement.*;
import Personajes.TypeHero.Role;
import Team.Group;
import java.util.ArrayList;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Combat {

    public Combat(int combat, Role jugador) {
        String texto;
        Element elemento = null;
        double multiplier = 1.3;
        Group enemigos = new Group();
        BuilderEnemy enemyBuilder = new BuilderEnemy();
        
        int numRandom = (int) (1+(Math.random()*4));
        switch(numRandom){
            case 1:
                elemento = new Fire();
                break;
            case 2:
                elemento = new Water();
                break;
            case 3:
                elemento = new Earth();
                break;
            case 4:
                elemento = new Wind();
                break;
        }
        
        switch (combat) {
            /*
            1:Fuego
            2:Agua
            3:Tierra
            4:Viento
             */
            //Introduccion
            case 0:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_0.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(1, enemyBuilder, 1, "Casco básico", null, "Arma básica"));
                break;
            case 1:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_1.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(1, enemyBuilder, 1, "Casco básico", "Pechera básica", "Arma básica"));
                enemigos.add(MagicWorld.director.createSwordMan(1, enemyBuilder, 2, "Casco básico", null, "Arma básica"));
                break;
            case 2:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_2.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(2, enemyBuilder, 2, "Casco básico", "Pechera básica", "Arma básica"));
                enemigos.add(MagicWorld.director.createSwordMan(1, enemyBuilder, 3, "Casco básico", "Pechera imperial", "Arma básica"));
                break;
            case 3:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_3.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createWizard(3, enemyBuilder, 2, "Casco imperial", "Pechera básica", "Arma básica"));
                enemigos.add(MagicWorld.director.createArcher(2, enemyBuilder, 3, "Casco imperial", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createSwordMan(2, enemyBuilder, 4, "Casco básico", "Pechera básica", "Arma básica"));
                break;
            case 4:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_4.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createWizard(4, enemyBuilder, 1, "Casco básico", "Pechera básica", "Arma básica"));
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 2, "Casco básico", "Pechera básica", "Arma básica"));
                enemigos.add(MagicWorld.director.createSwordMan(3, enemyBuilder, 4, "Casco básico", "Pechera imperial", "Arma imperial"));
                break;
            case 5:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_5.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createSwordMan(5, enemyBuilder, 1, "Casco básico", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 1, "Casco básico", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(4, enemyBuilder, 2, "Casco imperial", "Pechera básica", "Arma básica"));
                enemigos.add(MagicWorld.director.createWizard(4, enemyBuilder, 3, "Casco básico", "Pechera básica", "Arma básica"));
                break;
            case 6:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_6.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 2, "Casco básico", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createWizard(6, enemyBuilder, 1, "Casco básico", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createWizard(5, enemyBuilder, 2, "Casco básico", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createSwordMan(5, enemyBuilder, 1, "Casco éterea", "Pechera básica", "Arma básica"));
                break;
            case 7:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_7.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createSwordMan(7, enemyBuilder, 2, "Casco básico", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createSwordMan(7, enemyBuilder, 1, "Casco básico", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 3, "Casco básico", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(6, enemyBuilder, 4, "Casco básico", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createWizard(6, enemyBuilder, 4, "Casco básico", "Pechera básica", "Arma imperial"));
                break;
            case 8:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_8.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 1, "Casco imperial", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 2, "Casco básico", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 3, "Casco éterea", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(8, enemyBuilder, 4, "Casco básico", "Pechera básica", "Arma éterea"));
                break;
            case 9:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_9.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createWizard(9, enemyBuilder, 1, "Casco imperial", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createWizard(9, enemyBuilder, 2, "Casco básico", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createWizard(9, enemyBuilder, 3, "Casco éterea", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createWizard(9, enemyBuilder, 4, "Casco básico", "Pechera básica", "Arma éterea"));
                break;
            case 10:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_10.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createWizard(10, enemyBuilder, 3, "Casco básico", "Pechera éterea", "Arma imperial"));
                enemigos.add(MagicWorld.director.createWizard(10, enemyBuilder, 2, "Casco imperial", "Pechera básica", "Arma éterea"));
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 1, "Casco imperial", "Pechera básica", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(9, enemyBuilder, 3, "Casco imperial", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createSwordMan(9, enemyBuilder, 4, "Casco básico", "Pechera imperial", "Arma imperial"));
                break;
            //FINAL BOSS
            case 11:
                texto = MagicWorld.voz.LeerTXT("src/txt/combat_11.txt");
                System.out.println(texto.replace(".", ".\n"));
                MagicWorld.voz.speak(texto);
                enemigos.clear();
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 4, "Casco básico", "Pechera imperial", "Arma éterea"));
                enemigos.add(MagicWorld.director.createWizard(10, enemyBuilder, 3, "Casco básico", "Pechera éterea", "Arma éterea"));
                enemigos.add(MagicWorld.director.createWizard(10, enemyBuilder, 2, "Casco imperial", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createArcher(10, enemyBuilder, 2, "Casco imperial", "Pechera imperial", "Arma imperial"));
                enemigos.add(MagicWorld.director.createSwordMan(12, enemyBuilder, 1, "Casco imperial", "Pechera básica", "Arma imperial"));
                break;
            default:
                System.out.println(combat);
        }
        double maxHealth = jugador.character.getHealth();
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
        MagicWorld.voz.speak("Master Kill");

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
