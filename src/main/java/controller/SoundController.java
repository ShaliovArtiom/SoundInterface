package main.java.controller;

import main.java.model.Letter;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by shali on 22.10.2017.
 */
public class SoundController {

    private ArrayList<Letter> lettersList;
    private String path = "D:\\projects\\SoundInterface\\src\\main\\resource\\sounds";
    private String wav = ".wav";
    private String sound;

    public SoundController(ArrayList<Letter> lettersList) {
        this.lettersList = lettersList;
        play();
    }

    public void play(){
        try {
            for(int i = 0; i < lettersList.size(); i++) {
                if(lettersList.get(i).getLetter() == ' '){
                    Thread.sleep(300);
                    continue;
                }
                if(lettersList.get(i).isSoft()){
                    sound = path + "\\" + lettersList.get(i).getLetter() + "'" + wav;
                    i++;
                }else {
                    sound = path + "\\" + lettersList.get(i).getLetter() + wav;
                }
                File soundFile = new File(sound);
                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                clip.setFramePosition(0);
                clip.start();
                Thread.sleep(150);
            }
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
