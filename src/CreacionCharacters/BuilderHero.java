/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

import Personajes.Player;
import Personajes.TypeElement.Earth;
import Personajes.TypeElement.Element;
import Personajes.TypeElement.Fire;
import Personajes.TypeElement.Water;
import Personajes.TypeElement.Wind;
import Personajes.TypeHero.Archer;
import Personajes.TypeHero.Role;
import Personajes.TypeHero.SwordMan;
import Personajes.TypeHero.Wizard;
import magicworld.MagicWorld;

/**
 *
 * @author USERS
 */
public class BuilderHero implements BuilderCharacter {

    private Role hero;

    public BuilderHero() {
        //this.reset();
    }

    @Override
    public void reset() {
        this.hero.character = new Player();
    }

    @Override
    public void setCategoryAndElement(int typeCategory, int typeElement) {
        Element element = null;
        switch (typeElement) {
            case 1:
                element = new Fire();
                break;
            case 2:
                element = new Water();
                break;
            case 3:
                element = new Earth();
                break;
            case 4:
                element = new Wind();
                break;
        }

        switch (typeCategory) {
            case 2:
                this.hero = new Wizard(new Player(), element);
                break;
            case 1:
                this.hero = new Archer(new Player(), element);
                break;
            case 3:
                this.hero = new SwordMan(new Player(), element);
                break;
        }
    }

    @Override
    public Role getFinal() {
        Role finalHero = this.hero;
        finalHero.character.restaurarVida();
        //reset();
        return finalHero;
    }

    @Override
    public void setFront(String name) {
        this.hero.character.equipment[0] = MagicWorld.armory.search("Front", name);
    }

    @Override
    public void setHelmet(String name) {
        this.hero.character.equipment[1] = MagicWorld.armory.search("Helmet", name);
    }

    @Override
    public void setWeapon(String name) {
        this.hero.character.equipment[2] = MagicWorld.armory.search("Weapon", name);
    }

    @Override
    public void setLevel(int lvl) {
        this.hero.character.setLevel(lvl);
    }

}
