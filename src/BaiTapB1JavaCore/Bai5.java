package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số kWh tiêu thụ: ");
        int soKWh = scanner.nextInt();

        double tienDien = 0;

        if (soKWh <= 50) {
            tienDien = soKWh * 1678;
        } else if (soKWh <= 100) {
            tienDien = 50 * 1678 + (soKWh - 50) * 1734;
        } else if (soKWh <= 200) {
            tienDien = 50 * 1678 + 50 * 1734 + (soKWh - 100) * 2014;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soKWh - 200) * 2536;
        }

        System.out.printf("Tiền điện phải trả: %.0f đồng%n", tienDien);
    }
}

