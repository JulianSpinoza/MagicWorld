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
import Personajes.TypeHero.SwordMan;
import Personajes.TypeHero.Wizard;

/**
 *
 * @author USERS
 */
public class BuilderEnemy implements BuilderCharacter {
    
    private Personaje enemy;

    public BuilderEnemy(){
        this.reset();
    }
    
    @Override
    public void reset() {
        this.enemy = new Enemy(1);
    }

    @Override
    public void setCategoryAndElement(int typeCategory, int typeElement){
        Element element = null;
        switch(typeElement){
            case 1:
                element = new Fire();
                break;
            case 2:
                element = new Water();
                break;
        }
        
        switch(typeCategory){
            case 1:
                this.enemy = new Wizard(this.enemy, element);
                break;
            case 2:
                this.enemy = new Archer(this.enemy, element);
                break;
            case 3:
                this.enemy = new SwordMan(this.enemy, element);
                break;
        }
    }
    
    public Personaje getFinalEnemy(){
        Personaje finalEnemy = this.enemy;
        reset();
        return finalEnemy;
    }


    @Override
    public void setFront(String name) {
    }

    @Override
    public void setHelmet(String name) {
    }

    @Override
    public void setWeapon(String name) {
    }
    
}
