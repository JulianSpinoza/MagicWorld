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
    public void attack(Element element, double multiplier) {
        if(this.element.getName().equals(element.getName())){
            this.baseDamage*=multiplier;
        }
      System.out.print("Cargando flecha de "+this.element+" y se redujo la vida del enemigo en "+this.baseDamage+" puntos");
    }

    @Override
    public float getHealth(){
        return this.health;
    }
  
    @Override
    public Element getElement(){
        return this.element;
    }
    
  }