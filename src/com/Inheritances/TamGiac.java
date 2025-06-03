package com.Inheritances;

public class TamGiac extends DaGiac {

    public TamGiac() {
        super(3); // Tam giác luôn có 3 cạnh
    }

    public boolean kiemTraHopLe() {
        int a = kichThuocCanh[0];
        int b = kichThuocCanh[1];
        int c = kichThuocCanh[2];
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    @Override
    public int tinhChuVi() {
        return kichThuocCanh[0] + kichThuocCanh[1] + kichThuocCanh[2];
    }

    public double tinhDienTich() {
        double a = kichThuocCanh[0];
        double b = kichThuocCanh[1];
        double c = kichThuocCanh[2];
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

