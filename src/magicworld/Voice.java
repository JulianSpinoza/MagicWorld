package magicworld;

import com.sun.speech.freetts.VoiceManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Voice{
    
    private String name;
    private com.sun.speech.freetts.Voice voice;
    
    public Voice(){
        this.name = "kevin16";
        this.voice = VoiceManager.getInstance().getVoice(this.name);
        this.voice.allocate();
    }
    
    public void speak(String text){
        this.voice.setRate(120);
        this.voice.speak(text);
    }
    
    public String LeerTXT(String dir){
        String txt = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(dir));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine())!= null){
                temp = temp+bfRead;
            }
                txt = temp;
        }catch(Exception e){
            return null;
        }
        return txt;
    }
    
    public void MostrarEjemploStacts(){
        System.out.println("If your character's element is fire and you are fighting in the hell, your character's attack will be multiply by 1,5");
        System.out.println("If your character's element is water and your enemy's element is fire, your character's attack will be multiply by 2");
    }
    
}
