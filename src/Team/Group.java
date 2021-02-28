package Team;

import Personajes.TypeHero.Role;
import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Team {

    ArrayList<Role> personajes = new ArrayList<>();

    public void add(Role character) {
        personajes.add(character);
    }

    public void clear() {
        this.personajes.clear();
    }

    public Iterator getCharacters() {
        return this.personajes.iterator();
    }
}
