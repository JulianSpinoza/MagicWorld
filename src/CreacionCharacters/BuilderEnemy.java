/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

import Personajes.Enemy;
import Personajes.Personaje;
import Personajes.TypeElement.Element;
import Personajes.TypeElement.Fire;
import Personajes.TypeElement.Water;
import Personajes.TypeHero.Archer;
import Personajes.TypeHero.Role;
import Personajes.TypeHero.SwordMan;
import Personajes.TypeHero.Wizard;
import magicworld.MagicWorld;

/**
 *
 * @author USERS
 */
public class BuilderEnemy implements BuilderCharacter {

    private Role enemy;

    public BuilderEnemy() {
        //this.reset();
    }

    @Override
    public void reset() {
        this.enemy.character = new Enemy();
        this.enemy.element=null;
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
        }

        switch (typeCategory) {
            case 2:
                this.enemy = new Wizard(new Enemy(), element);
                break;
            case 1:
                this.enemy = new Archer(new Enemy(), element);
                break;
            case 3:
                this.enemy = new SwordMan(new Enemy(), element);
                break;
        }
    }

    @Override
    public Role getFinal() {
        Role finalEnemy = this.enemy;
        //reset();
        return finalEnemy;
    }

    @Override
    public void setFront(String name) {
        this.enemy.character.equipment[0] = MagicWorld.armory.search("Front", name);
    }

    @Override
    public void setHelmet(String name) {
        this.enemy.character.equipment[1] = MagicWorld.armory.search("Helmet", name);
    }

    @Override
    public void setWeapon(String name) {
        this.enemy.character.equipment[2] = MagicWorld.armory.search("Weapon", name);
    }

    @Override
    public void setLevel(int lvl) {
        this.enemy.character.setLevel(lvl);
    }

}
