package magicworld;

import com.sun.speech.freetts.VoiceManager;
import  com.sun.speech.freetts.Voice;

public class Interfaz {
    
    public void MostrarBienvenida(){
        VoiceManager manager = VoiceManager.getInstance();
        Voice voz = manager.getVoice("kevin16");
        voz.allocate();
        voz.speak("Hello World");
        voz.deallocate();
    }
    
}
