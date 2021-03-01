package CreacionCharacters;

import Personajes.TypeHero.Role;

/*
 * AUTORES: Yuneider Parada Pérez - 20191020058
 * Julián Camilo Espinosa Morales - 20191020073
 * Brayan Steven Arellano Espinosa - 20191020151
 */
public interface BuilderCharacter {

    public void reset();

    public void setLevel(int lvl);

    public void setCategoryAndElement(int typeCategory, int typeElement);

    public void setFront(String name);

    public void setHelmet(String name);

    public void setWeapon(String name);

    public Role getFinal();

}
