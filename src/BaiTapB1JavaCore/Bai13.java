package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tìm tất cả số nguyên tố từ 1 đến n");
            System.out.println("2. Tính tổng các chữ số của một số nguyên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findPrimes(scanner);
                    break;
                case 2:
                    calculateDigitSum(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }

    public static void findPrimes(Scanner scanner) {
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        System.out.println("Các số nguyên tố từ 1 đến " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void calculateDigitSum(Scanner scanner) {
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Tổng các chữ số của " + number + " là: " + sum);
    }
}

