package Team;

import Personajes.Personaje;
import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Team{
    
    ArrayList<Personaje> personajes = new ArrayList<Personaje>();
    public void add(Personaje character){
        personajes.add(character);
    }
    
    public Iterator getCharacters(){
        return this.personajes.iterator();
    }
}
