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
    public void attack(Element escenario, Element enemigo, double multiplier) {
        if(this.element.getName().equals(escenario.getName())){
            this.baseDamage*=multiplier;
        }
        if(this.element.getName().equals("Fuego")){
            switch(enemigo.getName()){
                case "Fuego":
                    this.baseDamage*=1;
                    break;
                case "Agua":
                    this.baseDamage*=0.5;
                    break;
                case "Tierra":
                    this.baseDamage*=0.8;
                    break;
                case "Viento":
                    this.baseDamage*=2;
                    break;
                default:
                    break;
            }
        }
        if(this.element.getName().equals("Agua")){
            switch(enemigo.getName()){
                case "Fuego":
                    this.baseDamage*=2;
                    break;
                case "Agua":
                    this.baseDamage*=1;
                    break;
                case "Tierra":
                    this.baseDamage*=1.3;
                    break;
                case "Viento":
                    this.baseDamage*=0.7;
                    break;
                default:
                    break;
            }
        }
        if(this.element.getName().equals("Tierra")){
            switch(enemigo.getName()){
                case "Fuego":
                    this.baseDamage*=2;
                    break;
                case "Agua":
                    this.baseDamage*=0.7;
                    break;
                case "Tierra":
                    this.baseDamage*=1;
                    break;
                case "Viento":
                    this.baseDamage*=0;
                    break;
                default:
                    break;
            }
        }
        if(this.element.getName().equals("Viento")){
            switch(enemigo.getName()){
                case "Fuego":
                    this.baseDamage*=0.7;
                    break;
                case "Agua":
                    this.baseDamage*=1.5;
                    break;
                case "Tierra":
                    this.baseDamage*=2;
                    break;
                case "Viento":
                    this.baseDamage*=1;
                    break;
                default:
                    break;
            }
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