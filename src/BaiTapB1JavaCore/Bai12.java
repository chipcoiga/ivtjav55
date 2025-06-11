package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        inBangCuuChuong();

        inHinhTamGiacSao();
    }

    public static void inBangCuuChuong() {
        System.out.println("=== BẢNG CỬU CHƯƠNG TỪ 1 ĐẾN 9 ===");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void inHinhTamGiacSao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng n để in hình tam giác sao: ");
        int n = scanner.nextInt();

        System.out.println("\n=== HÌNH TAM GIÁC SAO ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

