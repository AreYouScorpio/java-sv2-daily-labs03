package day02;

import java.util.Scanner;

public class PrimMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prim = scanner.nextInt();
        Prim prim2 = new Prim(prim);


        System.out.println(prim2.checkPrim());
    }
}
