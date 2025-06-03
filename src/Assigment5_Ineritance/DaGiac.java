package Assigment5_Ineritance;

import java.util.Scanner;

public class DaGiac {
    protected int soCanh;
    protected int[] cacCanh;

    public DaGiac(int soCanh) {
        this.soCanh = soCanh;
        this.cacCanh = new int[soCanh];
    }

    public void nhapCanh(Scanner sc) {
        System.out.println("Nhập độ dài các cạnh:");
        for (int i = 0; i < soCanh; i++) {
            System.out.print("Cạnh thứ " + (i + 1) + ": ");
            cacCanh[i] = sc.nextInt();
        }
    }

    public int tinhChuVi() {
        int chuVi = 0;
        for (int canh : cacCanh) {
            chuVi += canh;
        }
        return chuVi;
    }

    public void inCacCanh() {
        System.out.print("Các cạnh của đa giác: ");
        for (int canh : cacCanh) {
            System.out.print(canh + " ");
        }
        System.out.println();
    }
}
