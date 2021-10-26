package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {


    public static void main(String[] args) {


        // Scanner scanner = new  Scanner(System.in);
Students students = new Students();


students.addHeigth(160);
students.addHeigth(169);
students.addHeigth(170);


        // int height = scanner.nextInt();




        System.out.println(students.isHeightsIncreasing());
    }


}
