package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private int tipp;
    private int hiddenNumber;



    public int getTipp() {

        for (int i=1; i<7 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tipped: ");
            tipp = scanner.nextInt();

            if (tipp == hiddenNumber) {
                System.out.println("Talált'\n");
                return hiddenNumber;
            } else {
                System.out.println("Nem talált.\n");
            }
        }


        return hiddenNumber;
    }

}
