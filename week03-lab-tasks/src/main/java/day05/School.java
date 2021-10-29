package day05;

import java.util.Scanner;

public class School {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Journal journal = new Journal();

        System.out.println("Name: ");
        String name = scanner.nextLine();

        journal.addStudent(name);

        System.out.println(journal.getStudents().size());
        System.out.println(journal);


    }
}
