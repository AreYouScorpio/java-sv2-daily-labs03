package day03;

import java.util.Random;

public class GuessTheNumberMain {

    public static void main(String[] args) {

        int goodTipp;

        Random randomHiddenNumber = new Random();
        int hiddenNumber = randomHiddenNumber.nextInt(100);



        System.out.println("Gondoltam egy számot, 6x tippelhetsz 1-100 között! \n ");

        goodTipp=hiddenNumber.getTipp();

        System.out.println("A jó szám" + goodTipp + " volt.");


    }
}
