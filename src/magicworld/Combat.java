package magicworld;

import Personajes.*;
import Team.Group;
import java.util.Iterator;

public class Combat {
	public Combat(int combat, Player jugador) {
		Group enemigos = new Group();
                switch(combat){
                    case 1:
                        enemigos.add(new Enemy(1));
                        enemigos.add(new Enemy(1));
                }
                while(!winner(jugador, enemigos)){
                    jugador.attack();
                    Iterator<Enemy> enemy = enemigos.getCharacters();
                    while(enemy.hasNext()){
                        enemy.next().attack();
                    }
                }
                System.out.println("Combate finalizado");
                
	}

    private boolean winner(Player jugador, Group enemigos) {
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
}
