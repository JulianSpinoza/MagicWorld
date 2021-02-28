package Personajes.TypeElement;

public interface Element {

    public String getName();

    public void reaction(Element element, float percentage);

    public double getElementalDamage();

    public void setElementalDamage(double damage);
}
