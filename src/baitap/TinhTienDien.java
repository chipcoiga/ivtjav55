package baitap;

public class TinhTienDien {
    public static void main(String[] args) {
        int soKw = 400;
        float tongTienSuDung = tinhTienDien(soKw);
        System.out.println("Tong tien su dung: " + tongTienSuDung);
    }

    private static float tinhTienDien(int soKw) {
        if (soKw == 0) {
            return 0;
        }

        if (soKw <= 50) {
            return (1678 * soKw);
        }

        if (soKw <= 100) {
            float tongTienMuc1 = 1678 * 50;
            int soKwMuc2 = soKw - 50;
            float tongTienMuc2 = 1734 * soKwMuc2;
            return (tongTienMuc1 + tongTienMuc2);
        }

        if (soKw <= 200) {
            float tongTienMuc1 = 1678 * 50;
            float tongTienMuc2 = 1734 * 50;

            int soKwMuc3 = soKw - 100;
            float tongTienMuc3 = 2014 * soKwMuc3;

            return (tongTienMuc1 + tongTienMuc2 + tongTienMuc3);
        }

        float tongTienMuc1 = 1678 * 50;
        float tongTienMuc2 = 1734 * 50;
        float tongTienMuc3 = 2014 * 100;
        int soKwMuc4 = soKw - 200;
        float tongTienMuc4 = 2536 * soKwMuc4;

        return tongTienMuc1 + tongTienMuc2 + tongTienMuc3 + tongTienMuc4;
    }
}
