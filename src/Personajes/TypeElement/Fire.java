package Personajes.TypeElement;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Fire implements Element {

    public double elementalDamage;
    public String name;

    public Fire() {
        name = "Fuego";
        elementalDamage = 8.3;
    }

    @Override
    public void reaction(Element element, float percentage) {
        System.out.print("Se vaporizo e hizo un daño " + this.elementalDamage * percentage);
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
