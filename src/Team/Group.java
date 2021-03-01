package Team;

import Personajes.TypeHero.Role;
import java.util.ArrayList;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Group implements Team {

    ArrayList<Role> personajes = new ArrayList<>();

    public void add(Role character) {
        personajes.add(character);
    }

    public void clear() {
        this.personajes.clear();
    }

    public ArrayList getCharacters() {
        return this.personajes;
    }

    public Role getCharacter(int index) {
        try {
            return this.personajes.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice no encotrado, atacando al primero (así este muerto :v)");
            return this.personajes.get(0);
        }
    }
}
