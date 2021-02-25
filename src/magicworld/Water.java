public class Water implements Element{
    public double elementalDamage;
    public String name;
    public Water(){
      name= "Agua";
      elementalDamage = 2.3;
    }
    @Override
    public void reaction(Element element, float percentage){
      this.elementalDamage+=this.elementalDamage*percentage;
    }
  }