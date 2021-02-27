package Personajes.TypeHero;

import Personajes.TypeHero.Role;
import Personajes.TypeElement.Water;

public class SwordMan extends Role {
  
    public SwordMan(){
      super();
      this.baseDamage=206;
    }
  
    @Override
    public void attack() {
      System.out.print("Atacando con espada de "+this.element);
      this.element.reaction(new Water(),15);
    }
  
  }