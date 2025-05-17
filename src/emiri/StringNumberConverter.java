package emiri;

import java.util.Scanner;

public class StringNumberConverter {

    public static void main(String[] args) {
        int number = inputNumber();
        System.out.println("So ban da nhap: " + number);
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ky tu bat ky:");
        String numberString = scanner.nextLine();
        System.out.println("Chuoi vua nhap: " + numberString);
///sdffwfewfd
        try {
            int number = Integer.parseInt(numberString); //NumberFormatException
            System.out.println("Number thu duoc: " + number);

            //&& = AND
            // || = OR
            // is null
            // is not null
            if (number < 5 && number >= 2) { // >   <  <=   >=
                System.out.println("May nhap so nho hon 5");
                return inputNumber();
            }

            //!=  Khac
            // == giong nhau
            if (number != 3) {
                System.out.println("hehe");
            }

            return number;
        } catch (NumberFormatException exception) {
            System.out.println("Cai thu may vua nhap vao ko phai la Number");
            return inputNumber();
        }
    }

    //TODO BTVN: thay int bang float
    //Nop bai tap qua GIT
}
