package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Nhập vào một số nguyên: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên hợp lệ!");
            }
        }

        System.out.println("Bạn đã nhập số: " + number);
    }
}

