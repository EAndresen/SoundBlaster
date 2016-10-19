/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundblaster;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Eric
 */
public class SoundBlaster {

    Clip clip, clip2, clip3;

    public void startaLjud1() {
        try {
            URL url = this.getClass().getResource("loop.wav");

            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

            clip = AudioSystem.getClip();
            clip.open(audioIn);

        } catch (UnsupportedAudioFileException | IOException e) {

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        clip.start();
    }

    public void stoppaLjud1() {
        clip.stop();
    }

    public void startaLjud2() {
        try {

            URL url2 = this.getClass().getResource("blommans.wav");

            AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(url2);

            clip2 = AudioSystem.getClip();
            clip2.open(audioIn2);

        } catch (UnsupportedAudioFileException | IOException e) {

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        clip2.start();
    }

    public void stoppaLjud2() {
        clip2.stop();
    }
    
        public void startaLjud3() {
        try {
            URL url = this.getClass().getResource("8bit.wav");

            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

            clip3 = AudioSystem.getClip();
            clip3.open(audioIn);

        } catch (UnsupportedAudioFileException | IOException e) {

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        clip3.start();
    }

    public void stoppaLjud3() {
        clip3.stop();
    }
}
