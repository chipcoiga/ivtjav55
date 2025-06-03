package AssignmentInheritances;

import java.util.Scanner;

public abstract class DaGiac {

    public int SoCanhDaGiac;
    public static int[] KichThuocCanhDaGiac;
    public DaGiac(int SoCanhDaGiac){
        this.SoCanhDaGiac = SoCanhDaGiac;
        KichThuocCanhDaGiac = new int[SoCanhDaGiac];
    }


    public static void main(String[] args) {
        int SoCanhDagiac = SoCanhDagiac();
        int [] KichThuocCanhDaGiac =  NhapKichThuocCanhDaGiac(SoCanhDagiac);
        for(int i = 0; i < SoCanhDagiac; i++){
            System.out.println("khich thuoc canh da giac thu " + (i +1) +" la: " + KichThuocCanhDaGiac[i]);
        }

        int ChuVi =  ChuViDaGiac(KichThuocCanhDaGiac);
        System.out.println("chu vi da giac la: " + ChuVi);
        TamGiac tg = new TamGiac(3);

    }

    public static int ChuViDaGiac(int[] KichThuoc) {

        int ChuVi = 0;
        for(int i = 0; i < KichThuoc.length; i++){
            ChuVi = ChuVi + KichThuoc[i];
        }
        return ChuVi;
    }

    public static int[] NhapKichThuocCanhDaGiac(int SoCanhDagiac) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so canh da giac: ");
           int [] KichThuoc = new int[SoCanhDagiac];
           for(int i = 0; i < SoCanhDagiac; i++){
               System.out.println("nhap kich thuoc canh thu " + (i +1));
               KichThuoc[i] = scanner.nextInt();
           }

           return KichThuoc;

    }

        public static int SoCanhDagiac() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so canh cua da giac: ");
            int n = scanner.nextInt();
            return n;
        }

    public abstract int ChuViDaGiac();
}
