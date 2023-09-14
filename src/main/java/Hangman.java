/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marir
 */
public class Hangman {
    
    //counter for wrong guesses
    private int wrongCount;
    
    public Hangman(){
        this.wrongCount = wrongCount;
    }
    
    public void addWrongCount(){
        wrongCount++;
    }
    
    public int getWrongCount(){
        return wrongCount;
    }
    
    public void resetWrongCount(){
        wrongCount = 0;
    }
    
    //choosing the correct graphic
    public void hangmanGraphic(){
        if (wrongCount == 0) {
            hangmanGraphic0();
        } else if(wrongCount == 1){
            hangmanGraphic1();
        }else if(wrongCount == 2){
            hangmanGraphic2();
        }else if(wrongCount == 3){
            hangmanGraphic3();
        }else if(wrongCount == 4){
            hangmanGraphic4();
        }else if(wrongCount == 5){
            hangmanGraphic5();
        }else if(wrongCount == 6){
            hangmanGraphic6();
        }else if(wrongCount == 7){
            hangmanGraphic7();
        }else if(wrongCount == 8){
            hangmanGraphic8();
        }else if(wrongCount == 9){
            hangmanGraphic9();
        }
    }
    
    
    public void hangmanGraphic0(){
         /*System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");*/
         System.out.println("_____________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
        public void hangmanGraphic1(){
         System.out.println("  ");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
            public void hangmanGraphic2(){
         System.out.println("  ------");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
        public void hangmanGraphic3(){
         System.out.println("  ------");
         System.out.println(" |      |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
         public void hangmanGraphic4(){
         System.out.println("  ------");
         System.out.println(" |      |");
         System.out.println(" |      0");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
         public void hangmanGraphic5(){
         System.out.println("  ------");
         System.out.println(" |      |");
         System.out.println(" |      0");
         System.out.println(" |      |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
         public void hangmanGraphic6(){
         System.out.println("  ------");
         System.out.println(" |      |");
         System.out.println(" |      0");
         System.out.println(" |     /|");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
         public void hangmanGraphic7(){
         System.out.println("  ------");
         System.out.println(" |      |");
         System.out.println(" |      0");
         System.out.println(" |     /|\\ ");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
         public void hangmanGraphic8(){
         System.out.println("  ------");
         System.out.println(" |      |");
         System.out.println(" |      0");
         System.out.println(" |     /|\\ ");
         System.out.println(" |     / ");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
         public void hangmanGraphic9(){
         System.out.println("  ------");
         System.out.println(" |      |");
         System.out.println(" |      0");
         System.out.println(" |     /|\\ ");
         System.out.println(" |     / \\");
         System.out.println(" |");
         System.out.println(" |");
         System.out.println("_|___________");
         System.out.println("|            |");
         System.out.println("|____________|");   
    }
}
