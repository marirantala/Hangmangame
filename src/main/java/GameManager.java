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

public class GameManager {

    private ArrayList<String> guessWord = new ArrayList<>();
    private ArrayList<Boolean> isRevealed = new ArrayList<>();
    private ArrayList<String> guessedLetters = new ArrayList<>();
    private Words words;
    private Hangman hangman;
    private int gameStatus;
    private Scanner scanner;

    public GameManager() {

        this.gameStatus = 0; // 0 game not started, 1 game started, 2 game ends
        this.scanner = new Scanner(System.in);
        this.words = new Words();
        this.hangman = new Hangman();

    }

    public void startGame() {

        //fetches the guessable word
        guessWord = words.getWord();

        //creates boolean array for checking if letter has been guessed
        for (int i = 0; i < guessWord.size(); i++) {
            isRevealed.add(false);
        }

        //changes the game status to 1 = game started 
        gameStatus = 1;
        
        hangman.hangmanGraphic();
        textGraphic();

    }

    public void checkGameStatus() {
        //checks if game has been lost because of too many wrong guesses
        if (hangman.getWrongCount() >= 9) {
            System.out.println("Game over");
            System.out.println("New game? (yes or no)");
            while (true) {
                String answer = scanner.nextLine();
                if (answer.equals("yes")) {
                    //resets necessary variables for the game to start again
                    isRevealed.clear();
                    guessedLetters.clear();
                    hangman.resetWrongCount();
                    gameStatus = 0;
                    break;
                } else if (answer.equals("no")) {
                    gameStatus = 2;
                    break;
                } else {
                    System.out.println("Please answer yes or no");
                }
            }
            //checks if all the letters have been guessed = game won
        } else if (!isRevealed.contains(false)) {
            System.out.println("You won!");
            System.out.println("New game? (yes or no)");
            while (true) {
                String answer = scanner.nextLine();
                if (answer.equals("yes")) {
                    isRevealed.clear();
                    guessedLetters.clear();
                    hangman.resetWrongCount();
                    gameStatus = 0;
                    break;
                } else if (answer.equals("no")) {
                    gameStatus = 2;
                    break;
                } else {
                    System.out.println("Please answer yes or no");
                }
            }
        }
    }

    public void checkLetter() {

        System.out.println("Guess a letter");

        String letter = scanner.nextLine();

        // checks for null
        if (letter == null) {
            System.out.println("Input a letter");
            return;
        }
        //check if more than one letter
        if (letter.length() != 1) {
            System.out.println("Only one letter");
            return;
        }
        //check if string is a letter
        if ((Character.isLetter(letter.charAt(0)) == false)) {
            System.out.println("Input a letter");
            return;
        }
        //changes uppercase to lowercase
        if (Character.isUpperCase(letter.charAt(0))) {
            letter = letter.toLowerCase();
        }
        //checks if letter has already been guessed
        if (guessedLetters.contains(letter)) {
            System.out.println("Letter has already been guessed");
            return;
        } else {
            //adds letter to guessed letters list
            guessedLetters.add(letter);
        }
        //if guessed letter was wrong, adds to wrong count
        if (!guessWord.contains(letter)) {
            hangman.addWrongCount();

        } else {
            //if guess was correct, changes the corresponding index of isRevealed array to true
            for (int i = 0; i < guessWord.size(); i++) {
                if (letter.equals(guessWord.get(i))) {
                    isRevealed.set(i, true);
                }
            }
        }
            hangman.hangmanGraphic();
            textGraphic();
    }

    public void textGraphic() {
        //prints the word with unguessed letters showing up as -
        System.out.print("Word: ");
        for (int i = 0; i < guessWord.size(); i++) {
            if (isRevealed.get(i)) {
                System.out.print(guessWord.get(i));
            } else {
                System.out.print("-");
            }
        }
        //prints out the already guessed letters
        System.out.println("");
        System.out.print("Letters guessed: ");
        for (int i = 0; i < guessedLetters.size(); i++) {
            System.out.print(guessedLetters.get(i));
        }
        System.out.println("");
    }

    public int getGameStatus() {
        return gameStatus;
    }

}
