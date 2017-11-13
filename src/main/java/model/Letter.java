package main.java.model;

/**
 * Created by shali on 22.10.2017.
 */
public class Letter {

    private char letter;
    private boolean isSoft = false;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public boolean isSoft() {
        return isSoft;
    }

    public void setSoft(boolean soft) {
        isSoft = soft;
    }
}
