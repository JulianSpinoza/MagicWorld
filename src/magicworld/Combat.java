package magicworld;

import CreacionCharacters.BuilderEnemy;
import CreacionCharacters.Director;
import Personajes.*;
import Personajes.TypeElement.*;
import Team.Group;
import java.util.Iterator;

public class Combat {
	public Combat(int combat, Personaje jugador) {
            Element elemento=null;
            double multiplier=1.3;
		Group enemigos = new Group();
                BuilderEnemy enemyBuilder = new BuilderEnemy();
                switch(combat){
                    //Introduccion
                    case 0:
                        elemento = new Fire();
                        enemigos.clear();
                        enemigos.add(main.director.crearArquero(enemyBuilder, 2, Math.random()));
                    case 1:
                        enemigos.clear();
                        enemigos.add(new Enemy(1));
                        enemigos.add(new Enemy(1));
                    case 2:
                        enemigos.clear();
                        enemigos.add(new Enemy(2));
                        enemigos.add(new Enemy(1));
                    case 3:
                        enemigos.clear();
                        enemigos.add(new Enemy(3));
                        enemigos.add(new Enemy(2));
                        enemigos.add(new Enemy(2));
                    case 4:
                        enemigos.clear();
                        enemigos.add(new Enemy(4));
                        enemigos.add(new Enemy(4));
                        enemigos.add(new Enemy(3));
                    case 5:
                        enemigos.clear();
                        enemigos.add(new Enemy(5));
                        enemigos.add(new Enemy(4));
                        enemigos.add(new Enemy(4));
                        enemigos.add(new Enemy(4));
                    case 6:
                        enemigos.clear();
                        enemigos.add(new Enemy(6));
                        enemigos.add(new Enemy(6));
                        enemigos.add(new Enemy(5));
                        enemigos.add(new Enemy(5));
                    case 7:
                        enemigos.clear();
                        enemigos.add(new Enemy(7));
                        enemigos.add(new Enemy(7));
                        enemigos.add(new Enemy(6));
                        enemigos.add(new Enemy(6));
                        enemigos.add(new Enemy(6));
                    case 8:
                        enemigos.clear();
                        enemigos.add(new Enemy(8));
                        enemigos.add(new Enemy(8));
                        enemigos.add(new Enemy(8));
                        enemigos.add(new Enemy(8));
                    case 9:
                        enemigos.clear();
                        enemigos.add(new Enemy(9));
                        enemigos.add(new Enemy(9));
                        enemigos.add(new Enemy(9));
                        enemigos.add(new Enemy(9));
                    case 10:
                        enemigos.clear();
                        enemigos.add(new Enemy(10));
                        enemigos.add(new Enemy(10));
                        enemigos.add(new Enemy(10));
                        enemigos.add(new Enemy(9));
                        enemigos.add(new Enemy(9));
                    //FINAL BOSS
                    case 11:
                        enemigos.clear();
                        enemigos.add(new Enemy(10));
                        enemigos.add(new Enemy(10));
                        enemigos.add(new Enemy(10));
                        enemigos.add(new Enemy(10));
                        enemigos.add(new Enemy(12));
                }
                while(!winner(jugador, enemigos)){
                    Iterator<Enemy> enemy = enemigos.getCharacters();
                    while(enemy.hasNext()){
                        System.out.println(mostrarStats(enemy.next()));
                    }
                    jugador.attack(elemento, enemy.next().getElement(), multiplier);
                    
                    while(enemy.hasNext()){
                        enemy.next().attack(elemento, multiplier);
                    }
                }
                System.out.println("Combate finalizado");
                
	}

    private boolean winner(Personaje jugador, Group enemigos) {
        if (jugador.getHealth()==0){
            return true;
        }
        else{
            Iterator<Enemy> enemy = enemigos.getCharacters();
            int remaining = 0;
            while(enemy.hasNext()){
                remaining++;
                if (enemy.next().getHealth()==0){
                    remaining--;
                }
            }
            if (remaining==0){
                return true;
            }
        }
        return false;
    }

    private String mostrarStats(Enemy enemy) {
        String stats = "";
        stats+="La vida del enemigo es: "+enemy.getHealth()+" y su elemeneto es: "+enemy.getElement().getName();
        return stats;
    }
}
