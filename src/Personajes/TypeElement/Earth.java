/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes.TypeElement;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public class Earth implements Element {

    public double elementalDamage;
    public String name;

    public Earth() {
        name = "Earth";
        elementalDamage = 6.3;
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
