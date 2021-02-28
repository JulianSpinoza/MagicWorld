package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.Personaje;
import Personajes.TypeElement.Element;
import Personajes.TypeElement.Fire;

public abstract class Role extends Personaje{
  
    public Role (Personaje typeCharacter, Element typeElement){
        this.character = typeCharacter;
        this.element = typeElement;
    }
    
    public abstract Element getElement();
    
  }