package Assigment5_Ineritance;

public class TamGiac extends DaGiac {

    public TamGiac() {
        super(3);
    }

    public boolean kiemTraHopLe() {
        int a = cacCanh[0];
        int b = cacCanh[1];
        int c = cacCanh[2];
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    @Override
    public int tinhChuVi() {
        if (!kiemTraHopLe()) {
            System.out.println("Không thể tính chu vi vì tam giác không hợp lệ.");
            return 0;
        }
        return super.tinhChuVi();
    }


    public double tinhDienTich() {
        int a = cacCanh[0];
        int b = cacCanh[1];
        int c = cacCanh[2];
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

