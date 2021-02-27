package magicworld;

public class Fire implements Element{

    public double elementalDamage;
    public String name;
    
    public Fire(){
      name= "Fuego";
      elementalDamage = 8.3;
    }
  
    @Override
    public void reaction(Element element, float percentage){
      System.out.print("Se vaporizo e hizo un daño "+this.elementalDamage*percentage);
    }
  }