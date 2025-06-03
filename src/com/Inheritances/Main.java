package com.Inheritances;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TamGiac tg = new TamGiac();

        System.out.println("Nhập độ dài 3 cạnh của tam giác:");
        int[] doDai = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Cạnh " + (i + 1) + ": ");
            doDai[i] = sc.nextInt();
        }

        tg.nhapDoDai(doDai);
        if (tg.kiemTraHopLe()) {
            tg.inCacCanh();
            System.out.println("Chu vi tam giác: " + tg.tinhChuVi());
            System.out.printf("Diện tích tam giác: %.2f\n", tg.tinhDienTich());
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác hợp lệ.");
        }
    }
}

