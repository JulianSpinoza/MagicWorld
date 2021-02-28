/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes.Equipment;

import java.util.ArrayList;

/**
 *
 * @author USERS
 */
public class Armory {
    
    public ArrayList<Front> front = new ArrayList<Front>();
    public ArrayList<Helmet> helmet = new ArrayList<Helmet>();
    public ArrayList<Weapon> weapon = new ArrayList<Weapon>();
    
    public void addFront(String name, String description, float weight, float defenseMultiplier){
        front.add(new Front(name,description,weight,defenseMultiplier));
    }
    
    public void addHelmet(String name, String description, float defenseMultiplier){
        helmet.add(new Helmet(name,description,defenseMultiplier));
    }
    
    public void addWeapon(String name, String description, float attackMultiplier){
        weapon.add(new Weapon(name,description,attackMultiplier));
    }
    
    public Equipment search(String typeEquipment, String name){
        switch(typeEquipment){
            case "Front":
                for(Front actualFront : front){
                    if(actualFront.name.equals(name)){
                        return actualFront;
                    }
                }
                break;
            case "Helmet":
                for(Helmet actualHelmet : helmet){
                    if(actualHelmet.name.equals(name)){
                        return actualHelmet;
                    }
                }
                break;
            case "Weapon":
                for(Weapon actualWeapon : weapon){
                    if(actualWeapon.name.equals(name)){
                        return actualWeapon;
                    }
                }
                break;
        }
        
        return null;
    }
            
}
