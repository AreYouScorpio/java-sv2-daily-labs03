package day02;

import java.util.Scanner;

public class PrimMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prim prim2 = new Prim(1);

        int prim = scanner.nextInt();

        System.out.println(prim2.checkPrim());
    }
}
