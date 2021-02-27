package Personajes.TypeHero;

import Personajes.TypeHero.Role;

public class Archer extends Role {
    
    public Archer(){
      super();
      this.baseDamage=206;
    }
  
    @Override
    public void attack() {
      System.out.print("Cargando flecha de "+this.element);
    }
  
  }