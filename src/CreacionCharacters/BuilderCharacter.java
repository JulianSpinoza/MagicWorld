/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionCharacters;

/**
 *
 * @author USERS
 */
public interface BuilderCharacter {
    
    public void reset();
    public void setCategoryAndElement(int typeCategory, int typeElement);
    public void setFront(String name);
    public void setHelmet(String name);
    public void setWeapon(String name);
    
}
