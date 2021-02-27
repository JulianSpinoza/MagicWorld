package Personajes.TypeHero;

import Personajes.TypeHero.Role;
import Personajes.TypeElement.Water;

public class Wizard extends Role {
  
    public Wizard(){
      super();
      this.baseDamage=206;
    }
  
    @Override
    public void attack() {
      System.out.print("Lanzando hechizo de "+this.element);
      this.element.reaction(new Water(),15);
    }
  
  }