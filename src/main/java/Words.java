/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marir
 */
import java.util.ArrayList;

public class Words {

    private ArrayList<String> wordsList;

    public Words() {
        this.wordsList = new ArrayList<>();
    }

    //chooses and return the guessable word as letter array
    public ArrayList<String> getWord() {
        //clear any possible previous letter array
        wordsList.clear();
        //defining word, will later implement random choose from a list of words
        String word = "dezemos";

        // Creating array of letters in the word
        ArrayList letters = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            letters.add(String.valueOf(word.charAt(i)));
        }

        return letters;
    }

}
