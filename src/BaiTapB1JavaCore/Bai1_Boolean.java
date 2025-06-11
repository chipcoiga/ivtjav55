package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai1_Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        boolean isEven = (n % 2 == 0);

        System.out.println("Số " + n + " là số chẵn? " + isEven);

        scanner.close();
    }
}

