/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

import Personajes.Personaje;

/**
 *
 * @author USERS
 */
public class Director {
    
    public Personaje createArcher(BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon){
        
        builder.reset();
        builder.setCategoryAndElement(1, typeElement);
        if(nameFront != null){
            builder.setFront(nameFront);
        }
        if(nameHelmet != null){
            builder.setFront(nameHelmet);
        }
        if(nameWeapon != null){
            builder.setFront(nameWeapon);
        }
        return builder.getFinal();
        
    }
    
    public Personaje crearSwordMan(BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon){
        
        builder.reset();
        builder.setCategoryAndElement(2, typeElement);
        if(nameFront != null){
            builder.setFront(nameFront);
        }
        if(nameHelmet != null){
            builder.setFront(nameHelmet);
        }
        if(nameWeapon != null){
            builder.setFront(nameWeapon);
        }
        return builder.getFinal();
        
    }
    
    public Personaje crearWizard(BuilderCharacter builder, int typeElement, String nameHelmet, String nameFront, String nameWeapon){
        
        builder.reset();
        builder.setCategoryAndElement(1, typeElement);
        if(nameFront != null){
            builder.setFront(nameFront);
        }
        if(nameHelmet != null){
            builder.setFront(nameHelmet);
        }
        if(nameWeapon != null){
            builder.setFront(nameWeapon);
        }
        return builder.getFinal();
        
    }
    
}
