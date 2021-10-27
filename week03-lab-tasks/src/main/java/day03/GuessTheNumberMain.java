package day03;

import java.util.Random;

public class GuessTheNumberMain {

    public static void main(String[] args) {

        int goodTipp;

        Random randomHiddenNumber = new Random();
        GuessTheNumber guessTheNumber = new GuessTheNumber();



        int hiddenNumber = randomHiddenNumber.nextInt(101);

        guessTheNumber.setHiddenNumber(hiddenNumber);

        System.out.println("Gondoltam egy számot, 6x tippelhetsz 1-100 között! \n ");

        // System.out.println(hiddenNumber);

        goodTipp=guessTheNumber.getTipp();

        System.out.println("A jó szám" + goodTipp + " volt.");


    }
}
