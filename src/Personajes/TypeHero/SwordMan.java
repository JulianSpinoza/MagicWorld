package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;
import Personajes.TypeElement.Water;

public class SwordMan extends Role {
  
    public SwordMan(Personaje typeCharacter, Element typeElement){
      super(typeCharacter,typeElement);
      this.baseDamage=206;
    }
  
    @Override
    public void attack(Element element, double multiplier) {
      System.out.print("Atacando con espada de "+this.element);
      this.element.reaction(new Water(),15);
    }

    @Override
    public float getHealth(){
        return this.health;
    }
  
  }