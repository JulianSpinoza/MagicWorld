package Personajes.TypeHero;

import Personajes.Personaje;
import Personajes.TypeElement.Element;
import Personajes.TypeHero.Role;

public class Archer extends Role {
    
    public Archer(Personaje typeCharacter, Element typeElement){
      super(typeCharacter, typeElement);
      this.baseDamage=206;
    }
  
    @Override
    public void attack(Element element, float multiplier) {
      System.out.print("Cargando flecha de "+this.element);
    }
  
  }