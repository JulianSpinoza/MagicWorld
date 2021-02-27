package magicworld;

import com.sun.speech.freetts.VoiceManager;

public class Voice {
    
    private String name;
    private com.sun.speech.freetts.Voice voice;
    
    public Voice(){
        this.name = "kevin16";
        this.voice = VoiceManager.getInstance().getVoice(this.name);
        this.voice.allocate();
    }
    
    public void speak(String text){
        this.voice.speak(text);
    }
    
}
