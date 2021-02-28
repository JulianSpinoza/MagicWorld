package Personajes.TypeElement;

import Personajes.TypeElement.Element;

public class Water implements Element {

    public double elementalDamage;
    public String name;

    public Water() {
        name = "Agua";
        elementalDamage = 2.3;
    }

    @Override
    public void reaction(Element element, float percentage) {
        this.elementalDamage += this.elementalDamage * percentage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getElementalDamage() {
        return this.elementalDamage;
    }

    @Override
    public void setElementalDamage(double damage) {
        this.elementalDamage = damage;
    }
}
