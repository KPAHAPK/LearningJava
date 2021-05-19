package MidiPlayer;

import javax.sound.midi.*;


public class MidiMidiEvent {
    public static void main(String[] args) {
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 100, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
        }catch(Exception e){}
    }
}
