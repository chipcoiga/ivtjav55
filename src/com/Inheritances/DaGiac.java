package com.Inheritances;

public class DaGiac {
    protected int soCanh;
    protected int[] kichThuocCanh;

    public DaGiac(int soCanh) {
        this.soCanh = soCanh;
        kichThuocCanh = new int[soCanh];
    }

    public void nhapDoDai(int[] doDai) {
        for (int i = 0; i < soCanh; i++) {
            kichThuocCanh[i] = doDai[i];
        }
    }

    public int tinhChuVi() {
        int chuVi = 0;
        for (int i = 0; i < soCanh; i++) {
            chuVi += kichThuocCanh[i];
        }
        return chuVi;
    }

    public void inCacCanh() {
        System.out.print("Các cạnh của đa giác: ");
        for (int i = 0; i < soCanh; i++) {
            System.out.print(kichThuocCanh[i] + " ");
        }
        System.out.println();
    }
}

