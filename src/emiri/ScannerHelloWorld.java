package emiri;

import java.util.Scanner;

public class ScannerHelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String numberX = input.nextLine();

        System.out.println("Tao da nhan duoc code cua may: " + numberX);
        // sout
        int numberA = input.nextInt();
        System.out.println("numberA: " + numberA);

        int numberB = input.nextInt();
        System.out.println("numberB: " + numberB);

        int totalAB = numberB + numberA;
        System.out.println("Total numberA + numberB: " + totalAB);
    }
}
