/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.randomGuessNumber;

/**
 *
 * @author HP
 */
public class RandomGuessNumber {
    private String  guessNum;
    
    public RandomGuessNumber(){
        guessNum="N/A";
    }

    public RandomGuessNumber(String guessNum) {
        this.guessNum = guessNum;
    }

    public void setGuessNum(String guessNum) {
        this.guessNum = guessNum;
    }

    public String getGuessNum() {
        return guessNum;
    }

    @Override
    public String toString() {
        return "RandomGuessNumber{" + "guessNum=" + guessNum + '}';
    }
    
    
}
