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
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.Random;

public class Words {

    private ArrayList<String> wordsList;

    public Words() {
        this.wordsList = new ArrayList<>();
    }

    //chooses and return the guessable word as letter array
    public ArrayList<String> getWord() {
        //clear any possible previous letter array
        wordsList.clear();

        try ( Scanner fileScanner = new Scanner(Paths.get("possiblewords.txt"))) {
            //read the file until all lines have been read
            while (fileScanner.hasNextLine()) {
                //read one line and add it to array
                String row = fileScanner.nextLine();
                wordsList.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //getting random index number
        Random rand = new Random();
         int randomIndex = rand.nextInt(wordsList.size());
         
         //choosing word from file based on the random index number
         String word = wordsList.get(randomIndex);
        
        // Creating array of letters in the word
        ArrayList letters = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            letters.add(String.valueOf(word.charAt(i)));
        }

        return letters;
    }

}
