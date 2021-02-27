package Personajes.TypeHero;

import Personajes.Character;
import Personajes.Character;
import Personajes.TypeElement.Element;
import Personajes.TypeElement.Fire;

public abstract class Hero extends Character{

    //Attributes
    protected Element element;
  
    public Hero(int typeElement){
      element = new Fire();
    }
  
  }