package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;

public abstract class Role extends Personaje {

    public Personaje character;
    public Element element;

    public Role(Personaje typeCharacter, Element typeElement) {
        this.character = typeCharacter;
        this.element = typeElement;
    }

    public abstract Element getElement();
}
