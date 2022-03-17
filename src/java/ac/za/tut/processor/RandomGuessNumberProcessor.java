/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.processor;

import ac.za.tut.randomGuessNumber.RandomGuessNumber;

/**
 *
 * @author HP
 */
public class RandomGuessNumberProcessor {
    private RandomGuessNumber number;
    
    public RandomGuessNumberProcessor(){
        
    }

    public RandomGuessNumberProcessor(RandomGuessNumber number) {
        this.number = number;
    }
    public int determineRandom(){
        int random;
        int min =1;
        int max =5;
        
        //determine range 
        random=(int)Math.floor(Math.random()*(max-min +1)+min);
        return random;
    }
    public String determineoutcome(double random){
        int guessNum;
        String outcome;
        //get guessNumber
        guessNum = Integer.parseInt(number.getGuessNum());
        //
        if(guessNum == random){
            outcome="you win";
        }else{
            outcome = "you lose";
        }
        return outcome;
    }
}
