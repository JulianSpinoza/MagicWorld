package Personajes.TypeElement;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
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
