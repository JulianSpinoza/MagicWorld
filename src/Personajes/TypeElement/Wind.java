package Personajes.TypeElement;

public class Wind implements Element{

    public double elementalDamage;
    public String name;
    
    public Wind(){
      name= "Fuego";
      elementalDamage = 5.3;
    }
  
    @Override
    public void reaction(Element element, float percentage){
      System.out.print("Se vaporizo e hizo un daño "+this.elementalDamage*percentage);
    }
  }
