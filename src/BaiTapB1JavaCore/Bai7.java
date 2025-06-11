package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Cộng");
            System.out.println("2. Trừ");
            System.out.println("3. Nhân");
            System.out.println("4. Chia");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn chức năng (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số thứ nhất: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Kết quả: " + result);
                    break;
                case 2:
                    System.out.print("Nhập số thứ nhất: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Kết quả: " + result);
                    break;
                case 3:
                    System.out.print("Nhập số thứ nhất: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Kết quả: " + result);
                    break;
                case 4:
                    System.out.print("Nhập số thứ nhất: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Kết quả: " + result);
                    } else {
                        System.out.println("Lỗi: Không thể chia cho 0!");
                    }
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

            System.out.println(); // dòng trống ngăn cách

        } while (choice != 5);

        scanner.close();
    }
}

