package magicworld;

import Personajes.*;
import Team.Group;

public class Combat {
	public Combat(int combat, Player jugador) {
		Group enemigos = new Group();
                switch(combat){
                    case 1:
                        enemigos.add(new Enemy(1));
                        enemigos.add(new Enemy(1));
                }
                while(winner(jugador, enemigos)){
                    
                }
                
	}

    private boolean winner(Player jugador, Group enemigos) {
        if (jugador.getHealth()==0){
            return true;
        }
        return false;
    }
}
