package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public abstract class Role extends Personaje {

    public Personaje character;
    public Element element;

    public Role(Personaje typeCharacter, Element typeElement) {
        this.character = typeCharacter;
        this.element = typeElement;
    }

    public abstract Element getElement();
}
