public class Archer extends Hero {
  
    public Archer(int typeElement){
      super(typeElement);
    }
  
    @Override
    public void attack() {
      System.out.print("Cargando flecha de "+this.element);
    }
  
  }