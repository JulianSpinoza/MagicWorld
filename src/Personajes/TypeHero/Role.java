package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.Personaje;
import Personajes.TypeElement.Element;
import Personajes.TypeElement.Fire;

public abstract class Role extends Personaje{

    //Attributes
    protected Element element;
    protected Personaje character;
  
    public Role (Personaje typeCharacter, Element typeElement){
        character = typeCharacter;
        element = typeElement;
    }
    
    public abstract Element getElement();
    
  }