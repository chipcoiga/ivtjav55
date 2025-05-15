package emiri;

import java.util.Scanner;

public class StringNumberConverter {
    public static void main(String[] args) {
        int number = inputNumber();
        System.out.println("Code da chay toi day");
    }
    //abc
    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi so: ");
        String numberString = scanner.nextLine();
        System.out.println("Chuoi vua nhap: " + numberString);

        try {
            int number = Integer.parseInt(numberString);
            System.out.println("Number thu duoc: " + number);
            return number;
        } catch (NumberFormatException exception) {
            System.out.println("Cai thu may vua nhap vao ko phai la number");
            return inputNumber();
        }

    }
}
//BTVN : Thay int bang float