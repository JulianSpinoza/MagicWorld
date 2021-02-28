package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;
import Personajes.TypeElement.Water;

public class Wizard extends Role {
  
    public Wizard(Personaje typeCharacter, Element typeElement){
      super(typeCharacter, typeElement);
      this.baseDamage=206;
    }
  
    @Override
    public void attack() {
      System.out.print("Lanzando hechizo de "+this.element);
      this.element.reaction(new Water(),15);
    }
  
  }