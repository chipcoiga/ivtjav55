package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm trung bình: ");
        double diem = scanner.nextDouble();

        if (diem >= 8.5) {
            System.out.println("Xếp loại: Xuất sắc");
        } else if (diem >= 7.0) {
            System.out.println("Xếp loại: Giỏi");
        } else if (diem >= 5.5) {
            System.out.println("Xếp loại: Khá");
        } else if (diem >= 4.0) {
            System.out.println("Xếp loại: Trung bình");
        } else {
            System.out.println("Xếp loại: Yếu");
        }

        scanner.close();
    }
}

