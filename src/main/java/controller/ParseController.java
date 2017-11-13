package main.java.controller;


import main.java.model.Letter;

import java.util.ArrayList;

/**
 * Created by shali on 22.10.2017.
 */
public class ParseController {

    private String string;
    private ArrayList<Letter> lettersList;

    public ParseController(String string) {
        this.string = string;
        lettersList = new ArrayList<Letter>();
        parse();
    }

    private void parse() {
        for (int i = 0; i < string.length(); i++) {
            Letter letter = new Letter();
            switch (string.charAt(i)){
                case 'ь':
                    lettersList.get(i - 1).setSoft(true);
                    break;
                case 'я':
                    letter.setLetter('й');
                    lettersList.add(letter);
                    letter = new Letter();
                    letter.setLetter('а');
                    lettersList.add(letter);
                    break;
                case 'е':
                    letter.setLetter('й');
                    lettersList.add(letter);
                    letter = new Letter();
                    letter.setLetter('э');
                    lettersList.add(letter);
                    break;
                case 'ё':
                    letter.setLetter('й');
                    lettersList.add(letter);
                    letter = new Letter();
                    letter.setLetter('о');
                    lettersList.add(letter);
                    break;
                case 'ю':
                    letter.setLetter('й');
                    lettersList.add(letter);
                    letter = new Letter();
                    letter.setLetter('у');
                    lettersList.add(letter);
                    break;
                default:
                    letter.setLetter(string.charAt(i));
                    lettersList.add(letter);
                    break;
            }
            System.out.println(string.substring(i, i + 1));
        }

        new SoundController(lettersList);
    }
}
