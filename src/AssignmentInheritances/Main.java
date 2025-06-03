package AssignmentInheritances;

public class Main {
    public static void main(String[] args) {


        TamGiac tg = new TamGiac(3);
        boolean CheckTamGiac = tg.isTamGiac();
        System.out.println(CheckTamGiac);
        if (CheckTamGiac) {
            int ChuVi = TamGiac.ChuViDaGiac(DaGiac.NhapKichThuocCanhDaGiac(3));
            System.out.println("Chu vi tam giac bang: " + ChuVi);
            double DienTich = TamGiac.DienTichTamGiac();
            System.out.println("Dien Tich: " + DienTich);

        }
    }
}
