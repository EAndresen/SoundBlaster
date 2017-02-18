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
        if (clip == null) {
            try {
                URL url = this.getClass().getResource("/sound/loop.wav");

                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

                clip = AudioSystem.getClip();
                clip.open(audioIn);

            } catch (UnsupportedAudioFileException | IOException e) {

            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
            clip.start();
            clip = null;
            
        }
    }

    public void stoppaLjud1() {
        if (clip == null) {

        } else {
            clip.stop();
        }
        clip = null;
    }

    public void startaLjud2() {
        if (clip2 == null) {
            try {

                URL url2 = this.getClass().getResource("/sound/blommans.wav");

                AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(url2);

                clip2 = AudioSystem.getClip();
                clip2.open(audioIn2);

            } catch (UnsupportedAudioFileException | IOException e) {

            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
            clip2.start();
        }
    }

    public void stoppaLjud2() {
        if (clip2 == null) {

        } else {
            clip2.stop();
        }
        clip2 = null;
    }

    public void startaLjud3() {
        if (clip3 == null) {
            try {
                URL url = this.getClass().getResource("/sound/8bit.wav");

                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

                clip3 = AudioSystem.getClip();
                clip3.open(audioIn);

            } catch (UnsupportedAudioFileException | IOException e) {

            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
            clip3.start();
        }
    }

    public void stoppaLjud3() {
        if (clip3 == null) {

        } else {
            clip3.stop();
        }
        clip3 = null;
    }
}
