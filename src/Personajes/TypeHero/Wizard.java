package Personajes.TypeHero;

import Personajes.TypeHero.Hero;
import Personajes.TypeElement.Water;

public class Wizard extends Hero {
  
    public Wizard(int typeElement){
      super(typeElement);
      this.baseDamage=206;
    }
  
    @Override
    public void attack() {
      System.out.print("Lanzando hechizo de "+this.element);
      this.element.reaction(new Water(),15);
    }
  
  }