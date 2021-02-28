/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

import Personajes.Player;
import Personajes.Personaje;
import Personajes.TypeElement.Earth;
import Personajes.TypeElement.Element;
import Personajes.TypeElement.Fire;
import Personajes.TypeElement.Water;
import Personajes.TypeElement.Wind;
import Personajes.TypeHero.Archer;
import Personajes.TypeHero.SwordMan;
import Personajes.TypeHero.Wizard;

/**
 *
 * @author USERS
 */
public class BuilderHero implements BuilderCharacter {
    
    private Personaje hero;

    public BuilderHero(){
        this.reset();
    }
    
    @Override
    public void reset() {
        this.hero = new Player();
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
            case 3:
                element = new Earth();
                break;
            case 4:
                element = new Wind();
                break;
        }
        
        switch(typeCategory){
            case 1:
                this.hero = new Wizard(this.hero, element);
                break;
            case 2:
                this.hero = new Archer(this.hero, element);
                break;
            case 3:
                this.hero = new SwordMan(this.hero, element);
                break;
        }
    }
    
    public Personaje getFinalHero(){
        Personaje finalHero = this.hero;
        reset();
        return finalHero;
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
