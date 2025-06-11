package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai2_LogicPhucHop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một năm: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }

        scanner.close();
    }
}

