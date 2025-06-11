package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.print("Nhập số môn học: ");
        int soMon = scanner.nextInt();

        boolean coMonDuoi65 = false;
        for (int i = 1; i <= soMon; i++) {
            System.out.print("Nhập điểm môn thứ " + i + ": ");
            double diemMon = scanner.nextDouble();
            if (diemMon < 6.5) {
                coMonDuoi65 = true;
            }
        }

        System.out.print("Nhập số buổi vắng: ");
        int soBuoiVang = scanner.nextInt();

        if (diemTrungBinh >= 8.0 && !coMonDuoi65 && soBuoiVang <= 3) {
            System.out.println("Học sinh ĐỦ điều kiện nhận học bổng.");
        } else {
            System.out.println("Học sinh KHÔNG đủ điều kiện nhận học bổng.");
        }

        scanner.close();
    }
}
