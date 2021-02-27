package Personajes.TypeHero;

import Personajes.TypeHero.Hero;
import Personajes.TypeElement.Water;

public class SwordMan extends Hero {
  
    public SwordMan(int typeElement){
      super(typeElement);
      this.baseDamage=206;
    }
  
    @Override
    public void attack() {
      System.out.print("Atacando con espada de "+this.element);
      this.element.reaction(new Water(),15);
    }
  
  }