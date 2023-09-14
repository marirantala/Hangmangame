/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marir
 */
import java.util.Scanner;

public class UI {

    private GameManager gm;

    public UI() {
        this.gm = new GameManager();
    }

    public void gameUI() {
        //starts the game
        gm.startGame();
        while (true) {
            //check what the game status is
            gm.checkGameStatus();
            //0 starts a new game
            if (gm.getGameStatus() == 0) {
                gm.startGame();
            //1 game is on, keep guessing letters
            } else if (gm.getGameStatus() == 1) {
                gm.checkLetter();
            //2 game ends
            } else if (gm.getGameStatus() == 2) {
                break;
            }
        }
    }
}
