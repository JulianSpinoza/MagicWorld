package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Role extends Personaje implements Cloneable{

    public Personaje character;
    public Element element;

    public Role(Personaje typeCharacter, Element typeElement) {
        this.character = typeCharacter;
        this.element = typeElement;
    }

    public abstract Element getElement();
    
    public Role clonar() {
        try {
            return (Role) this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
}
