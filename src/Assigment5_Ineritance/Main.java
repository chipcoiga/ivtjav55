package Assigment5_Ineritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TamGiac tamGiac = new TamGiac();

        tamGiac.nhapCanh(sc);
        tamGiac.inCacCanh();

        if (tamGiac.kiemTraHopLe()) {
            System.out.println("Chu vi tam giác: " + tamGiac.tinhChuVi());
            System.out.printf("Diện tích tam giác: %.2f\n", tamGiac.tinhDienTich());
        } else {
            System.out.println("Tam giác không hợp lệ.");
        }

        sc.close();
    }
}
