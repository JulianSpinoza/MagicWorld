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
    public void attack(Element element, Element enemigo,double multiplier) {
        if(this.element.getName().equals(element.getName())){
            this.baseDamage*=multiplier;
        }
        System.out.print("Lanzando hechizo de "+this.element+" y se redujo la vida del enemigo en "+this.baseDamage+" puntos");
        this.element.reaction(new Water(),15);
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