package Personajes.TypeElement;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public interface Element {

    public String getName();

    public void reaction(Element element, float percentage);

    public double getElementalDamage();

    public void setElementalDamage(double damage);
}
